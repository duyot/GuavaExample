package com.vivas.generic;

import com.vivas.dto.User;

/**
 * Created by duyot on 8/29/2016.
 */
public class UserDAO extends BaseDAO<User>{
    public UserDAO() {
    }

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User u = new User("duyot",1,1);
        String user = "duyot";
        userDAO.save(u);
        userDAO.delete(u);
        userDAO.getById(1L);
        Class userClass = u.getClass();
        try {
            System.out.println((User)userClass.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
