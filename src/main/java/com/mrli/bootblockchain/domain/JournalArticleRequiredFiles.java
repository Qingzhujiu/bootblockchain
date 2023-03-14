package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName journal_article_required_files
 */
@TableName(value ="journal_article_required_files")
@Data
public class JournalArticleRequiredFiles implements Serializable {
    /**
     * 
     */
    @TableId
    private Long requiredFileId;

    /**
     * 
     */
    private String requiredFileName;

    /**
     * 
     */
    private Long articleId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}