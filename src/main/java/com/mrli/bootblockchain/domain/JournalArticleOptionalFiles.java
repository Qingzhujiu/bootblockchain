package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName journal_article_optional_files
 */
@TableName(value ="journal_article_optional_files")
@Data
public class JournalArticleOptionalFiles implements Serializable {
    /**
     * 
     */
    @TableId
    private Long optionalFileId;

    /**
     * 
     */
    private String optionalFileName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}