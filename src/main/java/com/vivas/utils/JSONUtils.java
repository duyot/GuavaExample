package com.vivas.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.vivas.dto.RQST;
import com.vivas.dto.Request;
import com.vivas.dto.TVODDTO;
import com.vivas.dto.TVODItemDTO;
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

    public static  <T> T stringToObject(String jsonString,Class objectClass){
        return (T)gson.fromJson(jsonString,objectClass);
    }

    public static void main(String[] args) {
        String str = "{\n" +
                "                   \"success\":true,\n" +
                "                   \"type\":\"video\",\n" +
                "                   \"apis_version\":\"257\",\n" +
                "                   \"quantity\":\"40\",\n" +
                "                   \"total_quantity\":\"1094\",\n" +
                "                   \"items\":[\n" +
                "                         { \n" +
                "                           \"video_id\":\"300066\",\n" +
                "                           \"video_english_title\":\"Angry Birds (2016)\",\n" +
                "                           \"video_vietnamese_title\":\"Báº§y Chim Ná»•i Giáº\u00ADn\",\n" +
                "                           \"video_price\":\"0.00\",\n" +
                "                           \"video_number_views\":\"33\",\n" +
                "                           \"video_duration\":\"0\",\n" +
                "                           \"video_director\":\"Clay Kaytis, Fergal Reilly\",\n" +
                "                           \"video_actor\":\"Jason Sudeikis, Josh Gad, Danny McBride\",\n" +
                "                           \"category_list\":\"HÃ nh Ä‘á»™ng;Hoáº¡t hÃ¬nh\",\n" +
                "                           \"video_description\":\"%3Cfont%20color%3D%27white%27%3EAngry%20Birds%20b%E1%BA%AFt%20%C4%91%E1%BA%A7u%20b%E1%BA%B1ng%20qu%C3%A1%20kh%E1%BB%A9%20t%E1%BB%99i%20nghi%E1%BB%87p%20c%E1%BB%A7a%20ch%C3%BA%20chim%20Red.%20T%E1%BB%AB%20nh%E1%BB%8F%20%C4%91%E1%BA%BFn%20l%E1%BB%9Bn%2C%20Red%20lu%C3%B4n%20b%E1%BB%8B%20xem%20l%C3%A0%20k%E1%BA%BB%20l%E1%BA%A1c%20lo%C3%A0i%20do%20b%E1%BB%99%20l%C3%B4ng%20m%C3%A0y%20%E2%80%9C%C4%91%E1%BB%99c%20v%C3%A0%20l%E1%BA%A1%E2%80%9D.%20Trong%20th%E1%BA%BF%20gi%E1%BB%9Bi%20lo%C3%A0i%20chim%2C%20ch%C3%BA%20qu%E1%BA%A3%20x%E1%BB%A9ng%20danh%20l%C3%A0%20%E2%80%9Cth%C3%A1nh%20nh%E1%BB%8D%E2%80%9D%3A%20%C4%91i%20h%E1%BB%8Dc%20th%C3%AC%20b%E1%BB%8B%20b%E1%BA%A1n%20b%C3%A8%20c%C6%B0%E1%BB%9Di%20nh%E1%BA%A1o%2C%20ra%20%C4%91%C6%B0%E1%BB%9Dng%20c%C5%A9ng%20b%E1%BB%8B%20tr%C3%AAu%20ch%E1%BB%8Dc%2C%20%C4%91%E1%BA%BFn%20l%C3%BAc%20ve%20v%C3%A3n%20c%C3%A1c%20c%C3%B4%20n%C3%A0ng%20c%C5%A9ng%20ch%E1%BA%B3ng%20xong.%20Ch%E1%BB%89%20%C4%91%E1%BA%BFn%20khi%20%C4%91%C3%A0n%20l%E1%BB%A3n%20xanh%20xu%E1%BA%A5t%20hi%E1%BB%87n%20v%C3%A0%20%C3%A2m%20m%C6%B0u%20c%C6%B0%E1%BB%9Bp%20s%E1%BA%A1ch%20tr%E1%BB%A9ng%20chim%2C%20Red%20c%C3%B9ng%20%C4%91%E1%BB%93ng%20b%E1%BB%8Dn%20m%E1%BB%9Bi%20c%C3%B3%20c%C6%A1%20h%E1%BB%99i%20tr%E1%BB%9F%20th%C3%A0nh%20%E2%80%9Canh%20h%C3%B9ng%E2%80%9D.%20%C4%90%E1%BB%83%20c%C3%B4ng%20ph%C3%A1%20l%C3%A2u%20%C4%91%C3%A0i%20c%E1%BB%A7a%20%C4%91%C3%A0n%20l%E1%BB%A3n%2C%20nh%E1%BB%AFng%20ch%C3%BA%20chim%20%C4%91%C3%A3%20ngh%C4%A9%20ra%20m%E1%BB%99t%20c%C3%A1ch%20%C4%91%E1%BB%99c%20%C4%91%C3%A1o%20l%C3%A0%20d%C3%B9ng%20n%C3%A1%20b%E1%BA%AFn%20ch%C3%ADnh%20m%C3%ACnh%20v%C3%A0o.%20Nh%E1%BB%AFng%20kh%C3%A1n%20gi%E1%BA%A3%20t%E1%BB%ABng%20say%20m%C3%AA%20tr%C3%B2%20ch%C6%A1i%20Angry%20Birds%20s%E1%BA%BD%20ho%C3%A0n%20to%C3%A0n%20th%E1%BB%8Fa%20m%C3%A3n%20v%E1%BB%9Bi%20trailer%20n%C3%A0y%2C%20%C4%91%E1%BA%B7c%20bi%E1%BB%87t%20khi%20ch%E1%BB%A9ng%20ki%E1%BA%BFn%20c%E1%BA%A3nh%20ch%C3%BA%20chim%20Chuck%20b%E1%BB%8B%20b%E1%BA%AFn%20xuy%C3%AAn%20qua%20h%C3%A0ng%20lo%E1%BA%A1t%20l%E1%BB%9Bp%20t%C6%B0%E1%BB%9Dng%20th%C3%A0nh%20v%E1%BB%9Bi%20bi%E1%BB%83u%20c%E1%BA%A3m%20v%C3%B4%20c%C3%B9ng%20h%C3%A0i%20h%C6%B0%E1%BB%9Bc.%20Khi%20l%C3%AAn%20phim%2C%20c%C3%A1c%20pha%20b%E1%BA%AFn%20n%C3%A1%20n%C3%A0y%20ch%E1%BA%AFc%20ch%E1%BA%AFn%20s%E1%BA%BD%20c%C3%B2n%20h%E1%BA%A5p%20d%E1%BA%ABn%20h%C6%A1n%20n%E1%BB%AFa.%20B%C3%AAn%20c%E1%BA%A1nh%20nh%E1%BB%AFng%20ch%C3%BA%20chim%2C%20b%E1%BA%A7y%20l%E1%BB%A3n%20xanh%20c%C5%A9ng%20xu%E1%BA%A5t%20hi%E1%BB%87n.%20D%C3%B9%20l%C3%A0%20k%E1%BA%BB%20x%E1%BA%A5u%2C%20ch%C3%BAng%20l%E1%BA%A1i%20c%C3%B3%20t%E1%BA%A1o%20h%C3%ACnh%20si%C3%AAu%20d%E1%BB%85%20th%C6%B0%C6%A1ng%20v%E1%BB%9Bi%20khu%C3%B4n%20m%E1%BA%B7t%20ng%E1%BB%99%20ngh%C4%A9nh%20v%C3%A0%20c%E1%BA%B7p%20m%C3%B4ng%20tr%C3%B2n%20tr%C4%A9nh%2C%20khi%E1%BA%BFn%20kh%C3%A1n%20gi%E1%BA%A3%20ph%E1%BA%A3i%20c%C6%B0%E1%BB%9Di%20l%C4%83n%20c%C6%B0%E1%BB%9Di%20b%C3%B2%20m%E1%BB%97i%20l%E1%BA%A7n%20b%E1%BA%A7y%20l%E1%BB%A3n%20xu%E1%BA%A5t%20hi%E1%BB%87n.%20%3C%2Ffont%3E\",\n" +
                "                           \"video_picture_path\":\"http://be.alotv.vn:80/sites/default/files/styles/iphone_category_medium/public/2The_Angry_Birds_Movie_2016.jpg?itok=m32MBPq6\"\n" +
                "                         }]\n" +
                "}";
        TVODDTO test = JSONUtils.<TVODDTO>stringToObject(str,TVODDTO.class);
        System.out.println(test);










//        //request item
//        RQST object = new RQST();
//        object.setName("get_label");
//        Request request = new Request(object);
//        //
//        String sendItem = object2JSONString(request);
//        //receive item using json.jar
//        JSONObject receviedJSONObject = new JSONObject(sendItem);
//        JSONObject jsonobjectRQST = receviedJSONObject.getJSONObject("rqst");
//
//        System.out.println(jsonobjectRQST.getString("name"));


    }

}
