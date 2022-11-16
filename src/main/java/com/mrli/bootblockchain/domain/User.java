package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.Value;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 使用雪花算法自动生成主键
     */
    @TableId(value = "user_id",type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 
     */
    @TableField(value = "user_name")
    private String name;

    /**
     * 
     */
    @TableField(value = "user_username")
    private String username;

    /**
     * 
     */
    @TableField(value = "user_password")
    private String password;

    /**
     * 
     */
    @TableField(value = "user_sex")
    private String sex;

    /**
     * 
     */
    @TableField(value = "user_address")
    private String address;

    /**
     * 
     */
    @TableField(value = "user_monad")
    private String monad;

    /**
     * 
     */
    @TableField(value = "user_phone_number")
    private String phone_number;

    /**
     * 
     */
    @TableField(value = "user_area")
    private String area;

    /**
     * 
     */
    @TableField(value = "user_rank")
    private String Rank;

    /**
     * 
     */
    @TableField(value = "user_education")
    private String education;

    /**
     * 
     */
    @TableField(value = "user_professional_field")
    private String professional_field;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}