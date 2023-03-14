package com.mrli.bootblockchain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mrli.bootblockchain.domain.JournalArticleType;
import com.mrli.bootblockchain.mapper.JournalArticleTypeMapper;
import com.mrli.bootblockchain.service.JournalArticleTypeService;
import org.springframework.stereotype.Service;

/**
* @author qingzhujiu
* @description 针对表【journal_article_type】的数据库操作Service实现
* @createDate 2023-03-13 23:13:30
*/
@Service
public class JournalArticleTypeServiceImpl extends ServiceImpl<JournalArticleTypeMapper, JournalArticleType>
    implements JournalArticleTypeService{



    @Override
    public int getArticalTypeId(String articleType) {
        LambdaQueryWrapper<JournalArticleType> journalArticleTypeLambdaQueryWrapper = new LambdaQueryWrapper<>();
        journalArticleTypeLambdaQueryWrapper.eq(JournalArticleType::getArticleType,articleType);

        JournalArticleType one = this.getOne(journalArticleTypeLambdaQueryWrapper);
        return one.getArticleTypeId();
    }
}




