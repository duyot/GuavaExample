package com.vivas.concurrent;

import com.google.common.util.concurrent.RateLimiter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by duyot on 8/2/2016.
 */
public class RateLimiterExample {

    final RateLimiter rateLimiter = RateLimiter.create(1);
    int number = 200;
    //
    Logger log = LoggerFactory.getLogger(RateLimiterExample.class);


    public void subtract(){
        //log.info(" First: "+number);
        rateLimiter.acquire(1);
        number -= 5;
        log.info(" After: "+number);
    }

    public static void main(String[] args) {
        RateLimiterExample rateLimiterExample = new RateLimiterExample();
        for(int i = 1;i<100;i++){
            rateLimiterExample.subtract();
        }





//        RateLimiter rateLimiter = RateLimiter.create(0.5);
//        for (int i = 0; i < 10; i++) {
//        rateLimiter.acquire(2);
//        System.out.println(new Date()+ ": "+ "beep..");
//        }
    }
}
