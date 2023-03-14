package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName journal_article_opposed_reviewers
 */
@TableName(value ="journal_article_opposed_reviewers")
@Data
public class JournalArticleOpposedReviewers implements Serializable {
    /**
     * 
     */
    @TableId
    private Long reviewerId;

    /**
     * 
     */
    private String reviewerFirstName;

    /**
     * 
     */
    private String reviewerLastName;

    /**
     * 
     */
    private String reviewerTypeAffiliation;

    /**
     * 
     */
    private String reviewerEmail;

    /**
     * 
     */
    private Long articleId;

    public JournalArticleOpposedReviewers(String reviewerFirstName, String reviewerLastName, String reviewerTypeAffiliation, String reviewerEmail, Long articleId) {
        this.reviewerFirstName = reviewerFirstName;
        this.reviewerLastName = reviewerLastName;
        this.reviewerTypeAffiliation = reviewerTypeAffiliation;
        this.reviewerEmail = reviewerEmail;
        this.articleId = articleId;
    }

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}