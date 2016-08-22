package com.vivas.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.vivas.dto.RQST;
import com.vivas.dto.Request;
import com.vivas.dto.TVODDTO;
import org.json.JSONObject;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by duyot on 7/7/2016.
 */
public class JSONUtils {
    public static Gson gson = new Gson();

    public static String object2JSONString(Object object){
        return gson.toJson(object);
    }

    public static JsonObject object2JSONObject(RQST object){
        JsonParser parser = new JsonParser();
        return parser.parse(gson.toJson(object)).getAsJsonObject();
    }

    public static Object stringToObject(String jsonString,Class objectClass){
        return gson.fromJson(jsonString,objectClass);
    }


    public static void main(String[] args) {
        //request item
        RQST object = new RQST();
        object.setName("get_label");
        Request request = new Request(object);
        //
        String sendItem = object2JSONString(request);
        //receive item using json.jar
        JSONObject receviedJSONObject = new JSONObject(sendItem);
        JSONObject jsonobjectRQST = receviedJSONObject.getJSONObject("rqst");

        System.out.println(jsonobjectRQST.getString("name"));


    }

}
