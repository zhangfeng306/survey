package com.huanliulusheng.entity;

public class SystemUserInfo {
    private String id;

    private String userId;

    private String userName;

    private String passWord;

    public SystemUserInfo(String id, String userId, String userName, String passWord) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
    }

    public SystemUserInfo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }
}