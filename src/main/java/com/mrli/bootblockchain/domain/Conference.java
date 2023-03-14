package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName conference
 */
@TableName(value ="conference")
@Data
public class Conference implements Serializable {
    /**
     * 
     */
    @TableId
    private Long conferenceId;

    /**
     * 
     */
    private Long committeeId;

    /**
     * 
     */
    private String committeeName;

    /**
     * 
     */
    private String conferenceDates;

    /**
     * 
     */
    private String paperOrPosterSubmissionDeadline;

    /**
     * 
     */
    private String tutorialProposalSubmissionDeadline;

    /**
     * 
     */
    private String demoSubmissionDeadline;

    /**
     * 
     */
    private String acceptanceNotifications;

    /**
     * 
     */
    private String tutorialAndDemoCcceptanceNotifications;

    /**
     * 
     */
    private String cameraReadyDeadline;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}