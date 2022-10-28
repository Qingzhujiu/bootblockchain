package com.mrli.bootblockchain.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
public class User implements Serializable {
    /**
     * 
     */
    @TableId
    private Long userId;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String userPassword;

    /**
     * 
     */
    private String userSex;

    /**
     * 
     */
    private String userPhone;

    /**
     * 
     */
    private Integer userStatus;

    /**
     * 
     */
    private String userEmail;

    /**
     * 
     */
    private String userAddress;

    /**
     * 
     */
    private String userRank;

    /**
     * 
     */
    private String userEducation;

    /**
     * 
     */
    private Long userBlockchainId;

    /**
     * 
     */
    private String userProfession;

    /**
     * 
     */
    private Date userCreateDate;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * 
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * 
     */
    public String getUserRank() {
        return userRank;
    }

    /**
     * 
     */
    public void setUserRank(String userRank) {
        this.userRank = userRank;
    }

    /**
     * 
     */
    public String getUserEducation() {
        return userEducation;
    }

    /**
     * 
     */
    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation;
    }

    /**
     * 
     */
    public Long getUserBlockchainId() {
        return userBlockchainId;
    }

    /**
     * 
     */
    public void setUserBlockchainId(Long userBlockchainId) {
        this.userBlockchainId = userBlockchainId;
    }

    /**
     * 
     */
    public String getUserProfession() {
        return userProfession;
    }

    /**
     * 
     */
    public void setUserProfession(String userProfession) {
        this.userProfession = userProfession;
    }

    /**
     * 
     */
    public Date getUserCreateDate() {
        return userCreateDate;
    }

    /**
     * 
     */
    public void setUserCreateDate(Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserAddress() == null ? other.getUserAddress() == null : this.getUserAddress().equals(other.getUserAddress()))
            && (this.getUserRank() == null ? other.getUserRank() == null : this.getUserRank().equals(other.getUserRank()))
            && (this.getUserEducation() == null ? other.getUserEducation() == null : this.getUserEducation().equals(other.getUserEducation()))
            && (this.getUserBlockchainId() == null ? other.getUserBlockchainId() == null : this.getUserBlockchainId().equals(other.getUserBlockchainId()))
            && (this.getUserProfession() == null ? other.getUserProfession() == null : this.getUserProfession().equals(other.getUserProfession()))
            && (this.getUserCreateDate() == null ? other.getUserCreateDate() == null : this.getUserCreateDate().equals(other.getUserCreateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserAddress() == null) ? 0 : getUserAddress().hashCode());
        result = prime * result + ((getUserRank() == null) ? 0 : getUserRank().hashCode());
        result = prime * result + ((getUserEducation() == null) ? 0 : getUserEducation().hashCode());
        result = prime * result + ((getUserBlockchainId() == null) ? 0 : getUserBlockchainId().hashCode());
        result = prime * result + ((getUserProfession() == null) ? 0 : getUserProfession().hashCode());
        result = prime * result + ((getUserCreateDate() == null) ? 0 : getUserCreateDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userSex=").append(userSex);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", userRank=").append(userRank);
        sb.append(", userEducation=").append(userEducation);
        sb.append(", userBlockchainId=").append(userBlockchainId);
        sb.append(", userProfession=").append(userProfession);
        sb.append(", userCreateDate=").append(userCreateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}