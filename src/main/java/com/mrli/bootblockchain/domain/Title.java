package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName title
 */
@TableName(value ="title")
@Data
public class Title implements Serializable {
    /**
     * 
     */
    private Long committeeId;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String userTitle;

    /**
     * 
     */
    private String committeeName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}