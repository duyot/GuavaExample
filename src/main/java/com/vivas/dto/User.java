package com.vivas.dto;

import com.vivas.generic.BaseModel;

import javax.xml.bind.annotation.*;

/**
 * Created by duyot on 8/1/2016.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User extends BaseModel{

    private String username;
    private int currentBalace;
    private int discount;


    public User() {
    }

    public static void main(String[] args) {
        User user1 = new User("duyot",1,1);
        User user2 = new User("duyot",1,1);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println("A".hashCode());
    }

    public User(String username, int currentBalace, int discount) {
        this.username = username;
        this.currentBalace = currentBalace;
        this.discount = discount;
    }

    @Override
    public boolean equals(Object object){
        return (object instanceof User) && this.username == ((User)object).getUsername();
    }

    public void printUsername(){
        System.out.println("Username is: "+ username);
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCurrentBalace() {
        return currentBalace;
    }

    public void setCurrentBalace(int currentBalace) {
        this.currentBalace = currentBalace;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
