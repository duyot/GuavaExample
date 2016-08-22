package com.vivas.precondition;

import com.google.common.base.Preconditions;
import org.joda.time.LocalDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by duyot on 8/4/2016.
 */
public class PreconditionExample {

    public static void testLoop(){

        Date startDate = null;
        Date endDate = null;
        Calendar calL = Calendar.getInstance();
        calL.set(11, 0);
        calL.set(12, 0);
        calL.set(13, 0);
        calL.set(14, 0);
        calL.set(5, calL.getActualMinimum(5));


        endDate = calL.getTime();

        calL.add(2, -1);
        calL.set(5, calL.getActualMinimum(5));

        startDate = calL.getTime();

        LocalDate startLocalDate = new LocalDate(startDate);
        LocalDate endLocalDate = new LocalDate(endDate);

        for (LocalDate date = startLocalDate; date.isBefore(endLocalDate); date = date.plusDays(1))
        {
            System.out.println("Start process time: "+ date.toDate().toString());
            System.out.println("End process time: "+ getEndOfDate(date.toDate()).toString());
            //
            date.getDayOfMonth();
        }
    }

    public static Date getEndOfDate(Date date) {
        if (date == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        c.set(Calendar.MILLISECOND, 999);
        return c.getTime();
    }

    private static void sendSMSList(int contractId, int templateId, String smsSub){
        try {
            Preconditions.checkArgument(smsSub.length()>5,"ContracId must be number");
            System.out.println(contractId +""+ templateId + smsSub);
        } catch (Exception  e) {
            e.printStackTrace();
        }
    }

    public static Date getStartOfPreviousDate(){
        Calendar myCal = Calendar.getInstance();
        myCal.set(Calendar.HOUR_OF_DAY, 0);//hh
        myCal.set(12, 00);//mm
        myCal.set(13, 00);//ss
        myCal.set(14, 0);
        myCal.add(Calendar.DAY_OF_MONTH, -1);
        //
        return myCal.getTime();
    }
    public static Date getEndOfPreviousDate(){
        Calendar myCal = Calendar.getInstance();
        myCal.set(Calendar.HOUR_OF_DAY, 23);//hh
        myCal.set(12, 59);//mm
        myCal.set(13, 59);//ss
        myCal.set(14, 0);
        myCal.add(Calendar.DAY_OF_MONTH, -1);
        //
        return myCal.getTime();
    }

    public static void testCalendar(){
        Date startDate = null;
        Date endDate = null;
        Calendar calL = Calendar.getInstance();
        calL.set(11, 0);
        calL.set(12, 0);
        calL.set(13, 0);
        calL.set(14, 0);
        calL.set(5, calL.getActualMinimum(5));


        endDate = calL.getTime();

        calL.add(2, -1);
        calL.set(5, calL.getActualMinimum(5));

        startDate = calL.getTime();
        calL.set(5, calL.getActualMaximum(5));

        System.out.println("Start date: "+ startDate);
        System.out.println("End date: "+ endDate);
    }

    public static void main(String[] args) {
        PreconditionExample.testLoop();
//        System.out.println(PreconditionExample.getStartOfPreviousDate());
//        System.out.println(PreconditionExample.getEndOfPreviousDate());

    }
}
