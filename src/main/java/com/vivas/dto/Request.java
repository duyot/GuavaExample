package com.vivas.dto;

/**
 * Created by duyot on 7/7/2016.
 */
public class Request {
    RQST RQST;

    public Request(com.vivas.dto.RQST RQST) {
        this.RQST = RQST;
    }

    public com.vivas.dto.RQST getRQST() {
        return RQST;
    }

    public void setRQST(com.vivas.dto.RQST RQST) {
        this.RQST = RQST;
    }
}
