package com.huanyu.common.bean;

import java.io.Serializable;

public class VoteBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String a1;

    private String a2;

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }
}
