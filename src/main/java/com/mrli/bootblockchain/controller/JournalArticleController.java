package com.mrli.bootblockchain.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mrli.bootblockchain.common.R;
import com.mrli.bootblockchain.domain.*;
import com.mrli.bootblockchain.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequestMapping(value = "/journal")
public class JournalArticleController {
    @Autowired
    JournalArticleService journalArticleService;
    @Autowired
    JournalArticleAdditionalInfoService journalArticleAdditionalInfoService;
    @Autowired
    JournalArticleAnimalSubjectService journalArticleAnimalSubjectService;
    @Autowired
    JournalArticleTypeService journalArticleTypeService;
    @Autowired
    JournalArticleAuthorsService journalArticleAuthorsService;
    @Autowired
    JournalArticleOpposedReviewersService journalArticleOpposedReviewersService;


    @Transactional
    @RequestMapping(value = "/submit")
    public R<String> journalSubmit(@RequestBody JSONObject article) {
        //将前端传入的json数据进行解析
        String articleType = article.getString("articleType");
        String title = article.getString("title");
        String anAbstract = article.getString("abstract");
        JSONArray authors = article.getJSONArray("authors");
        String sex = article.getString("sex");
        String area = article.getString("area");
        JSONArray affiliations = article.getJSONArray("affiliations");
        JSONArray keywords = article.getJSONArray("keywords");
        JSONArray subjectCategory = article.getJSONArray("subjectCategory");
        JSONArray manuscriptID = article.getJSONArray("manuscriptID");
        String informedConsent = article.getString("informedConsent");
        String animalSubjects = article.getString("animalSubjects");
        String explain = article.getString("explain");
        String firstName = article.getString("firstName");
        String lastName = article.getString("lastName");
        String email = article.getString("email");
        String typeAffiliation = article.getString("typeAffiliation");
        String manuscriptType = article.getString("manuscriptType");
        String justification = article.getString("justification");
        String scope = article.getString("scope");
        String uniqueContribution = article.getString("uniqueContribution");

        int articalTypeId;
        Long animalSubjectId;
        Long articleAdditionalInfoId;

        //TODO 待办 将optionalFile和requiredFile文件存入并获取文件的id
        // 因为optionalFile为1对1关系 requiredFile为1对n的关系 所以article表中只存入optionalFile的id
        Long optionalFileId=0L;

        //获取传入的articleType对应的id为多少
        articalTypeId = journalArticleTypeService.getArticalTypeId(articleType);

        //构造journalArticleAdditionalInfo，此时类中无id
        //TODO manuscriptID未正确填入 该属性作用未知
        JournalArticleAdditionalInfo journalArticleAdditionalInfo = new JournalArticleAdditionalInfo(explain, justification, informedConsent, keywords.toString(), manuscriptType, uniqueContribution, subjectCategory.toString(), scope, 0L);
        //调用save方法，雪花算法将自动生成主键id 并返回到类对象中
        journalArticleAdditionalInfoService.save(journalArticleAdditionalInfo);
        //获取主键id
        articleAdditionalInfoId = journalArticleAdditionalInfo.getArticleAdditionalInfoId();

        //对AnimalSubject表进行存储
        JournalArticleAnimalSubject journalArticleAnimalSubject = new JournalArticleAnimalSubject(animalSubjects);
        journalArticleAnimalSubjectService.save(journalArticleAnimalSubject);
        //获取主键id
        animalSubjectId = journalArticleAnimalSubject.getAnimalSubjectId();


        //TODO 待办，将传入的author数据存入数据库并获取主键 原因：author作用未知
        JournalArticleAuthors journalArticleAuthors = new JournalArticleAuthors();
        journalArticleAuthorsService.save(journalArticleAuthors);

        //获取journalArticle的id
        JournalArticle journalArticle = new JournalArticle(title,anAbstract,optionalFileId,articleAdditionalInfoId,animalSubjectId,articalTypeId);
        Long articleId = journalArticle.getArticleId();

        //对journalArticleOpposedReviewers表进行存储
        JournalArticleOpposedReviewers journalArticleOpposedReviewers = new JournalArticleOpposedReviewers(firstName,lastName,typeAffiliation,email,articleId);
        journalArticleOpposedReviewersService.save(journalArticleOpposedReviewers);

        return R.success("投稿成功！",1);
    }


}
