package com.vivas.dto;

/**
 * Created by duyot on 8/1/2016.
 */
public class User {
    private String username;
    private int currentBalace;
    private int discount;

    public User(String username, int currentBalace, int discount) {
        this.username = username;
        this.currentBalace = currentBalace;
        this.discount = discount;
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
