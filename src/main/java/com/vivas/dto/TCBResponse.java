package com.vivas.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by duyot on 9/8/2016.
 */
@XmlRootElement(name = "SendSMSResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class TCBResponse {
    @XmlElement(name="MsgID")
    private String MsgID;
    @XmlElement(name="RespCode")
    private String RespCode;
    @XmlElement(name="RespDesc")
    private String RespDesc;
    @XmlElement(name="Signature")
    private String Signature;

    public TCBResponse(String msgID, String respCode, String respDesc, String signature) {
        MsgID = msgID;
        RespCode = respCode;
        RespDesc = respDesc;
        Signature = signature;
    }

    public TCBResponse() {
    }

    public String getMsgID() {

        return MsgID;
    }

    public void setMsgID(String msgID) {
        MsgID = msgID;
    }

    public String getRespCode() {
        return RespCode;
    }

    public void setRespCode(String respCode) {
        RespCode = respCode;
    }

    public String getRespDesc() {
        return RespDesc;
    }

    public void setRespDesc(String respDesc) {
        RespDesc = respDesc;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }
}
