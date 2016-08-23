package com.vivas.utils;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

/**
 * Created by duyot on 8/9/2016.
 */
public class JodaTimeUtils {

    private static void test(){
        LocalDate localDate = new LocalDate();
        LocalTime localTime = new LocalTime();
        LocalDateTime localDateTime = new LocalDateTime();
        System.out.println("Local date: "+ localDate);
        System.out.println("Local time: "+ localTime);
        System.out.println("Local datetime: "+ localDateTime);
    }

    public static void main(String[] args) {
        JodaTimeUtils.test();
    }
}
