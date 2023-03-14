package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName journal_article_animal_subject
 */
@TableName(value ="journal_article_animal_subject")
@Data
public class JournalArticleAnimalSubject implements Serializable {
    /**
     * 
     */
    @TableId
    private Long animalSubjectId;

    /**
     * 
     */
    private String animalSubject;

    public JournalArticleAnimalSubject(String animalSubject) {
        this.animalSubject = animalSubject;
    }

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}