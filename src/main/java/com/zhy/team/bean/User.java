package com.zhy.team.bean;

import java.util.Date;

/**
 * Created by zhy on 2018/6/22 0022.
 */
public class User {
    private String userID;//主键ID
    private String userAccount;//账号
    private String userName;//用户名
    private String userPassword;//密文密码
    private String phone;//电话
    private String address;//通信地址
    private String gradeID;//机构ID
    private String isOnline;//是否在线
    private Date updateTime;//更新时间
    private Date createTime;//创建时间
    private int state;//状态【0正常】【-1删除】


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGradeID() {
        return gradeID;
    }

    public void setGradeID(String gradeID) {
        this.gradeID = gradeID;
    }

    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", gradeID='" + gradeID + '\'' +
                ", isOnline='" + isOnline + '\'' +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                ", state=" + state +
                '}';
    }
}
