package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName journal_article_additional_info
 */
@TableName(value ="journal_article_additional_info")
@Data
public class JournalArticleAdditionalInfo implements Serializable {
    /**
     * 
     */
    @TableId
    private Long articleAdditionalInfoId;

    /**
     * 
     */
    private String explain;

    /**
     * 
     */
    private String justification;

    /**
     * 
     */
    private String informedConsent;

    /**
     * 
     */
    private String keywords;

    /**
     * 
     */
    private String manuscriptType;

    /**
     * 
     */
    private String uniqueContribution;

    /**
     * 
     */
    private String subjectCategory;

    /**
     * 
     */
    private String scope;

    /**
     * 
     */
    private Long manuscriptId;

    public JournalArticleAdditionalInfo(String explain, String justification, String informedConsent, String keywords, String manuscriptType, String uniqueContribution, String subjectCategory, String scope, Long manuscriptId) {
        this.explain = explain;
        this.justification = justification;
        this.informedConsent = informedConsent;
        this.keywords = keywords;
        this.manuscriptType = manuscriptType;
        this.uniqueContribution = uniqueContribution;
        this.subjectCategory = subjectCategory;
        this.scope = scope;
        this.manuscriptId = manuscriptId;
    }

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}