package com.vivas.generic;

import com.vivas.dto.User;

/**
 * Created by duyot on 8/29/2016.
 */
public class BaseModel {

    public static <T> String save(T object){
        System.out.println("Saving object t..."+ object.getClass());
        return "SUCCESS";
    }

    public static void main(String[] args) {
        User user = new User("abc");
        BaseModel.save(user);
    }
}
