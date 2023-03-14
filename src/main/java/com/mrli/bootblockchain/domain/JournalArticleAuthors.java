package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName journal_article_authors
 */
@TableName(value ="journal_article_authors")
@Data
public class JournalArticleAuthors implements Serializable {
    /**
     * 
     */
    @TableId
    private Long authorId;

    /**
     * 
     */
    private String authorName;

    /**
     * 
     */
    private String authorSex;

    /**
     * 
     */
    private String authorArea;

    /**
     * 
     */
    private String authorAffiliation;

    /**
     * 
     */
    private Long articleId;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}