package com.vivas.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by duyot on 7/11/2016.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RegisterRequest {
    @XmlElement
    public String userName;
    public String userIP;
    public String channel;
    public String application;
    public String packageName;
    public String msisdn;
    public String promotion;
    public String trial;
    public String note;
    //Dung cho truong hop chuyen so thue bao
    public String msisdnA;
    public String msisdnB;

    public RegisterRequest() {
    }

    public RegisterRequest(String userName, String userIP, String channel, String application, String packageName, String msisdn, String promotion, String trial, String note, String msisdnA, String msisdnB) {
        this.userName = userName;
        this.userIP = userIP;
        this.channel = channel;
        this.application = application;
        this.packageName = packageName;
        this.msisdn = msisdn;
        this.promotion = promotion;
        this.trial = trial;
        this.note = note;
        this.msisdnA = msisdnA;
        this.msisdnB = msisdnB;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIP() {
        return userIP;
    }


    public void setUserIP(String userIP) {
        this.userIP = userIP;
    }

    public String getChannel() {
        return channel;
    }


    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getTrial() {
        return trial;
    }

    public void setTrial(String trial) {
        this.trial = trial;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMsisdnA() {
        return msisdnA;
    }

    public void setMsisdnA(String msisdnA) {
        this.msisdnA = msisdnA;
    }

    public String getMsisdnB() {
        return msisdnB;
    }

    public void setMsisdnB(String msisdnB) {
        this.msisdnB = msisdnB;
    }
}
