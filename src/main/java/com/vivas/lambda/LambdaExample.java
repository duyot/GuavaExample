//package com.vivas.lambda;
//
//import com.google.common.collect.Lists;
//import com.vivas.dto.User;
//
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;
//import java.util.Collections;
//import java.util.Date;
//import java.util.List;
//import java.util.Random;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//
///**
// * Created by duyot on 8/3/2016.
// */
//public class LambdaExample {
//
//    public static List<User> initListUser(){
//        List<User> lstUsers = Lists.newArrayList();
//        Random rd = new Random();
//        for (int i = 0; i < 1000000; i++) {
//            lstUsers.add(new User("duyot",rd.nextInt(10000),0));
//        }
//        return lstUsers;
//    }
//
//    public static void testPerformaceWithLambda(List<User> lstUser){
//        long startime = System.currentTimeMillis();
////        System.out.println("Number: "+ searchUserByPredicate(lstUser,p -> p.getCurrentBalace() > 5000).size());
//        System.out.println("Lambda procession time: "+ (System.currentTimeMillis() - startime)+ "ms");
//    }
//    public static void testPerformaceWithFor(List<User> lstUser){
//        long startime = System.currentTimeMillis();
//        List<User> lstUserWithBalance = Lists.newArrayList();
//        for(User u:lstUser){
//            if(u.getCurrentBalace()> 5000){
//                lstUserWithBalance.add(u);
//            }
//        }
//        System.out.println("Number:"+ lstUserWithBalance.size());
//        System.out.println("For procession time: "+ (System.currentTimeMillis() - startime)+ "ms");
//    }
//
//    private static void test(){
//        List<String> lstName = Lists.newArrayList("New York","London","Paris");
////        lstName.forEach(value -> System.out.println(value));
//    }
//
//    public static List<User> searchUserByPredicate(List<User> lstUser, Predicate<User> predicate){
////        return lstUser.stream().filter(predicate).collect(Collectors.toList());
//    }
//
//    private static void testDateTime(){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss,SSS");
//        LocalDate date = LocalDate.now();
//        Date currentDate = new Date();
//        System.out.println(simpleDateFormat.format(currentDate));
//        LocalDate nextMonth = date.plus(1,ChronoUnit.MONTHS);
//        System.out.println(nextMonth);
//    }
//
//    private static int sum(List<Integer> lstNumber, Predicate<Integer> predicate){
//        int total = 0;
//        for(int i:lstNumber){
//            if(predicate.test(i)){
//                total += i;
//            }
//        }
//        return total;
//    }
//
//    private static User updateUserBalaceAfterDiscount(User user,Predicate<User> predicate){
//        if(predicate.test(user)){
//            user.setDiscount(user.getCurrentBalace()*20/100);
//        }
//        return user;
//    }
//
//    public static boolean isValidForDiscount(User user){
//        return user.getCurrentBalace()> 3000;
//    }
//
//    public static void sortUserListByName(List<User> lstUser){
//        Collections.sort(lstUser,(p1,p2) -> p1.getUsername().compareTo(p2.getUsername()));
////        lstUser.forEach(p-> p.setDiscount(5000));
////        lstUser.forEach(User::printUsername);
////        lstUser.stream().filter(p -> p.getCurrentBalace() >3000).ma
//        List<User> lst = lstUser.stream()
//                        .filter(p -> p.getCurrentBalace() >3000)
//                        .collect(Collectors.toList());
//        //
//        System.out.println(lst.size());
//    }
//
//    public static void main(String[] args) {
//        List<User> lstUsers = Lists.newArrayList();
//        lstUsers.add(new User("duyot",5000,0));
//        lstUsers.add(new User("abc",8000,0));
//        lstUsers.add(new User("1sdd",2000,0));
//
////        LambdaExample.updateUserBalaceAfterDiscount(user,u -> LambdaExample.isValidForDiscount(u));
////        LambdaExample.testDateTime();
//        //
////        System.out.println(LambdaExample.searchUserByPredicate(lstUsers,p -> p.getCurrentBalace()>5000).size());;
//
//        LambdaExample.testPerformaceWithFor(LambdaExample.initListUser());
//        LambdaExample.testPerformaceWithLambda(LambdaExample.initListUser());
//    }
//}
