package com.huanliulusheng.entity;

import java.util.Date;

public class VoteInfo {
    private String id;

    private String questionCode;

    private String questionName;

    private String answerCode;

    private String answerName;

    private Integer answerScore;

    private String batchNo;

    private Date createTime;

    public VoteInfo(String id, String questionCode, String questionName, String answerCode, String answerName, Integer answerScore, String batchNo, Date createTime) {
        this.id = id;
        this.questionCode = questionCode;
        this.questionName = questionName;
        this.answerCode = answerCode;
        this.answerName = answerName;
        this.answerScore = answerScore;
        this.batchNo = batchNo;
        this.createTime = createTime;
    }

    public VoteInfo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode == null ? null : questionCode.trim();
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName == null ? null : questionName.trim();
    }

    public String getAnswerCode() {
        return answerCode;
    }

    public void setAnswerCode(String answerCode) {
        this.answerCode = answerCode == null ? null : answerCode.trim();
    }

    public String getAnswerName() {
        return answerName;
    }

    public void setAnswerName(String answerName) {
        this.answerName = answerName == null ? null : answerName.trim();
    }

    public Integer getAnswerScore() {
        return answerScore;
    }

    public void setAnswerScore(Integer answerScore) {
        this.answerScore = answerScore;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}