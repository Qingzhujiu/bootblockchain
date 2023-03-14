package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName committee
 */
@TableName(value ="committee")
@Data
public class Committee implements Serializable {
    /**
     * 
     */
    @TableId
    private Long committeeId;

    /**
     * 
     */
    private String committeeName;

    /**
     * 
     */
    private String presidentName;

    /**
     * 
     */

    private String committeeAbstract;

    /**
     * 
     */
    private String missionStatement;

    /**
     * 
     */
    private String visionStatement;

    /**
     * 
     */
    private String viceChairman1;

    /**
     * 
     */
    private String viceChairman2;

    /**
     * 
     */
    private String createTime;

    /**
     * 
     */
    private Integer state;

    /**
     * 
     */
    private byte[] logo;

    /**
     *
     */
    private Long presidentId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}