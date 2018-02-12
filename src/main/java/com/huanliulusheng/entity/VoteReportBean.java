package com.huanliulusheng.entity;

import java.io.Serializable;

public class VoteReportBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String questionCode;

    private String questionName;

    private String answerCode;

    private String answerName;

    private Integer sumAnswer;

    public VoteReportBean() {
        super();
    }

    public VoteReportBean(String questionCode, String questionName, String answerCode, String answerName, Integer sumAnswer) {
        this.questionCode = questionCode;
        this.questionName = questionName;
        this.answerCode = answerCode;
        this.answerName = answerName;
        this.sumAnswer = sumAnswer;
    }

    public Integer getSumAnswer() {
        return sumAnswer;
    }

    public void setSumAnswer(Integer sumAnswer) {
        this.sumAnswer = sumAnswer;
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getAnswerCode() {
        return answerCode;
    }

    public void setAnswerCode(String answerCode) {
        this.answerCode = answerCode;
    }

    public String getAnswerName() {
        return answerName;
    }

    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }
}
