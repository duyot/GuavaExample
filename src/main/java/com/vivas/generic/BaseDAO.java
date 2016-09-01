package com.vivas.generic;

import com.vivas.dto.User;

/**
 * Created by duyot on 8/29/2016.
 */
public class BaseDAO<T extends BaseModel> {

    public String save(T object){
            System.out.println("Saving object t..."+ object.getClass());
            return "SUCCESS";
    }

    public String delete(T object){
        System.out.println("Deleting object t..."+ object.getClass());
        return "SUCCESS";
    }

    public <T> T getById(long id){
        System.out.println("Getting object with id = "+ id);
        System.out.println("SUCCESS");
        return (T) get();
    }

    public Object get(){
        return new Object();
    }



    public static void main(String[] args) {
//        BaseDAO<User> userDAO = new BaseDAO<>();
//        User u = new User("duyot",1,1);
//        String user = "duyot";
//        userDAO.save(u);
    }

}
