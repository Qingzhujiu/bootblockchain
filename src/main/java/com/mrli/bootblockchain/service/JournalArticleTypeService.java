package com.mrli.bootblockchain.service;

import com.mrli.bootblockchain.domain.JournalArticleType;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author qingzhujiu
* @description 针对表【journal_article_type】的数据库操作Service
* @createDate 2023-03-13 23:13:30
*/
public interface JournalArticleTypeService extends IService<JournalArticleType> {
    /**
     * 根据传入的 articleType 查询该articleYype对应的id为多少
     * @param articleType
     * @return
     */
    int getArticalTypeId(String articleType);
}
