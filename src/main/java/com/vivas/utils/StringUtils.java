package com.vivas.utils;

import java.util.Objects;

/**
 * Created by duyot on 9/30/2016.
 */
public class StringUtils {

    public static void test(){
        System.out.println(String.join("dfdf","2323","SUCCESS","123456a@"));
    }

    public static void sayHello(String name){
        Objects.requireNonNull(name,"Name could not null");
        System.out.println("Hello "+ name);
    }
    public static void formatingOutput(){
        double number = 100000.0/3;
//        System.out.println(number);
        System.out.printf("%,.2f",number);
        System.out.printf("Hello %s, you are now %d years old","duyot",24);
        System.out.println(String.format("%,.3",number));
    }

    public static void main(String[] args) {
        StringUtils.formatingOutput();
    }
}
