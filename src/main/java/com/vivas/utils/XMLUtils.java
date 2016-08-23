package com.vivas.utils;

import com.vivas.dto.RegisterRequest;
import com.vivas.dto.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by duyot on 7/11/2016.
 */
public class XMLUtils {
    public static StringWriter sw = new StringWriter();

    public static String objectToXMLString(Object object){
        try {
            JAXBContext jaxbContext   = JAXBContext.newInstance(object.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.marshal(object,sw);
            return sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            return "";
        }


    }

    public static <T> T xmlToObject(String xmlContent,Class objectClass){
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(objectClass);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xmlContent);
            return (T) unmarshaller.unmarshal(reader);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
//        RegisterRequest registerRequest = new RegisterRequest();
//        registerRequest.setUserName("duyot");
//        registerRequest.setApplication("viettalk");
//        registerRequest.setChannel("chanel_a");
//        registerRequest.setMsisdn("84975114692");
//        registerRequest.setPackageName("V2");
//        registerRequest.setNote("note");
//        registerRequest.setUserIP("127.0.0.1");
//        String xmlRR = XMLUtils.objectToXMLString(registerRequest);
//        System.out.println(xmlRR);
//        System.out.println(xmlToObject(xmlRR).getUserName());
        User u = new User("duyot",1,2);
        String userXML = XMLUtils.objectToXMLString(u);
        System.out.println(userXML);
        User userFromXML = XMLUtils.xmlToObject(userXML,User.class);

    }
}
