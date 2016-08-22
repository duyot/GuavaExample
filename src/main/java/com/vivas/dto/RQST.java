package com.vivas.dto;

import java.util.List;

/**
 * Created by duyot on 7/7/2016.
 */
public class RQST {

    private String name;
    private String REQID;
    private String LABELID;
    private String TEMPLATEID;
    private String CONTRACTID;
    private String CONTRACTTYPEID;
    private String SCHEDULETIME;
    private String MOBILELIST;
    private String ISTELCOSUB;
    private String AGENTID;
    private String APIUSER;
    private String APIPASS;
    private String USERNAME;
    private String DATACODING;
    //
    List<Param> PARAMS;

    public RQST() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getREQID() {
        return REQID;
    }

    public void setREQID(String REQID) {
        this.REQID = REQID;
    }

    public String getLABELID() {
        return LABELID;
    }

    public void setLABELID(String LABELID) {
        this.LABELID = LABELID;
    }

    public String getTEMPLATEID() {
        return TEMPLATEID;
    }

    public void setTEMPLATEID(String TEMPLATEID) {
        this.TEMPLATEID = TEMPLATEID;
    }


    public String getCONTRACTID() {
        return CONTRACTID;
    }

    public void setCONTRACTID(String CONTRACTID) {
        this.CONTRACTID = CONTRACTID;
    }

    public String getCONTRACTTYPEID() {
        return CONTRACTTYPEID;
    }

    public void setCONTRACTTYPEID(String CONTRACTTYPEID) {
        this.CONTRACTTYPEID = CONTRACTTYPEID;
    }

    public String getSCHEDULETIME() {
        return SCHEDULETIME;
    }

    public void setSCHEDULETIME(String SCHEDULETIME) {
        this.SCHEDULETIME = SCHEDULETIME;
    }

    public String getMOBILELIST() {
        return MOBILELIST;
    }

    public void setMOBILELIST(String MOBILELIST) {
        this.MOBILELIST = MOBILELIST;
    }

    public String getISTELCOSUB() {
        return ISTELCOSUB;
    }

    public void setISTELCOSUB(String ISTELCOSUB) {
        this.ISTELCOSUB = ISTELCOSUB;
    }

    public String getAGENTID() {
        return AGENTID;
    }

    public void setAGENTID(String AGENTID) {
        this.AGENTID = AGENTID;
    }

    public String getAPIUSER() {
        return APIUSER;
    }

    public void setAPIUSER(String APIUSER) {
        this.APIUSER = APIUSER;
    }

    public String getAPIPASS() {
        return APIPASS;
    }

    public void setAPIPASS(String APIPASS) {
        this.APIPASS = APIPASS;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getDATACODING() {
        return DATACODING;
    }

    public void setDATACODING(String DATACODING) {
        this.DATACODING = DATACODING;
    }

    public List<Param> getPARAMS() {
        return PARAMS;
    }

    public void setPARAMS(List<Param> PARAMS) {
        this.PARAMS = PARAMS;
    }
}
