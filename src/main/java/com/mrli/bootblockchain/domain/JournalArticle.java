package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName journal_article
 */
@TableName(value ="journal_article")
@Data
public class JournalArticle implements Serializable {
    /**
     * 
     */
    @TableId
    private Long articleId;

    /**
     * 
     */
    private String articleTitle;

    /**
     * 
     */
    private String articleAbstract;

    /**
     * 
     */
    private Long optionalFileId;

    /**
     * 
     */
    private Long articleAdditionalInfoId;

    /**
     * 
     */
    private Long animalSubjectId;

    /**
     * 
     */
    private int articleTypeId;


    public JournalArticle(String articleTitle, String articleAbstract, Long optionalFileId, Long articleAdditionalInfoId, Long animalSubjectId, int articleTypeId) {
        this.articleTitle = articleTitle;
        this.articleAbstract = articleAbstract;
        this.optionalFileId = optionalFileId;
        this.articleAdditionalInfoId = articleAdditionalInfoId;
        this.animalSubjectId = animalSubjectId;
        this.articleTypeId = articleTypeId;
    }

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}