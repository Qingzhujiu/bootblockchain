package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName journal_article_type
 */
@TableName(value ="journal_article_type")
@Data
public class JournalArticleType implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer articleTypeId;

    /**
     * 
     */
    private String articleType;

    public JournalArticleType(String articleType) {
        this.articleType = articleType;
    }

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}