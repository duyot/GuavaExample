package com.vivas.dto;

import com.google.common.collect.Lists;
import com.vivas.utils.XMLUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by duyot on 9/7/2016.
 */
@XmlRootElement(name = "TCBRequestListMT")
@XmlAccessorType(XmlAccessType.FIELD)
public class TCBRequestListMT {
    @XmlElement(name="Signature")
    private String Signature;

    @XmlElement(name="TCBRequestMT")
    List<TCBRequestMT> lstTcbRequestMT;

    public static void main(String[] args) {
        TCBRequestListMT tcbRequestListMT = new TCBRequestListMT();
        tcbRequestListMT.setSignature("duyot123");
        TCBRequestMT tcbRequestMT = new TCBRequestMT();
        tcbRequestMT.setMsgText("noi dung test");
        TCBRequestMT tcbRequestMT1 = new TCBRequestMT();
        tcbRequestMT1.setMsgText("noi dung test 1");
        List<TCBRequestMT> lstTCBRequestMTs = Lists.newArrayList();
        lstTCBRequestMTs.add(tcbRequestMT);
        lstTCBRequestMTs.add(tcbRequestMT1);
        tcbRequestListMT.setLstTcbRequestMT(lstTCBRequestMTs);
        String content = XMLUtils.objectToXMLString(tcbRequestListMT);
        System.out.println(content);
        TCBRequestListMT parsedObject = XMLUtils.xmlToObject(content,TCBRequestListMT.class);
        System.out.println(parsedObject.getSignature());
    }

    public TCBRequestListMT(String signature, List<TCBRequestMT> lstTcbRequestMT) {
        Signature = signature;
        this.lstTcbRequestMT = lstTcbRequestMT;
    }

    public TCBRequestListMT() {
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public List<TCBRequestMT> getLstTcbRequestMT() {
        return lstTcbRequestMT;
    }

    public void setLstTcbRequestMT(List<TCBRequestMT> lstTcbRequestMT) {
        this.lstTcbRequestMT = lstTcbRequestMT;
    }
}
