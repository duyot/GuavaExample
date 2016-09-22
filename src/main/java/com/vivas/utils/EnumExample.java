package com.vivas.utils;

/**
 * Created by duyot on 9/20/2016.
 */
public class EnumExample {


    public enum Weekday{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    public enum API_TYPE{
        CC("1"),CSKH("2");

        public String apiTypeValue;

        API_TYPE(String apiTypeValue){
            this.apiTypeValue = apiTypeValue;
        }

        public String getValue(){
            return this.apiTypeValue;
        }
    }

    public static void testGetEnumValue(){
        System.out.println(API_TYPE.CC.getValue());
    }

    public static void getJob(Weekday weekday){
        Weekday[] weekdays = Weekday.values();
        for(Weekday day:weekdays){
            System.out.println(day);
        }


        if(weekday == Weekday.SATURDAY || weekday == Weekday.SUNDAY){
            System.out.println("Free..");
        }else{
            System.out.println("Coding..");
        }
    }

    public static void main(String[] args) {
        EnumExample.testGetEnumValue();
    }
}
