package com.vivas.dto;

/**
 * Created by duyot on 7/7/2016.
 */
public class Param {
    String NUM;
    String CONTENT;

    public Param(String NUM, String CONTENT) {
        this.NUM = NUM;
        this.CONTENT = CONTENT;
    }

    public String getNUM() {
        return NUM;
    }

    public void setNUM(String NUM) {
        this.NUM = NUM;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
    }
}
