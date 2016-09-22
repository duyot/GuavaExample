package com.vivas.utils;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by duyot on 8/9/2016.
 */
public class JodaTimeUtils {

    public static void testNumberFormat(){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
        double x = 1.90;
        System.out.println(numberFormat.format(x));
    }

    private static void test(){
        LocalDate localDate = new LocalDate();
        LocalTime localTime = new LocalTime();
        LocalDateTime localDateTime = new LocalDateTime();
        System.out.println("Local date: "+ localDate);
        System.out.println("Local time: "+ localTime);
        System.out.println("Local datetime: "+ localDateTime);
    }

    public static void main(String[] args) {
        JodaTimeUtils.testNumberFormat();
    }
}
