package com.baizhi.test;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class SpringTask {

 @Scheduled(fixedDelay=3000)
    public void test1(){
     System.out.println("task1:"+new Date());
 }
 @Scheduled(fixedRate = 2000,initialDelay = 1000)
    public void test2(){

     System.out.println("task2:"+new Date());
 }
 @Scheduled(cron = "0 * * * * ?")
 public void test3(){
     System.out.println("task3:"+new Date());
 }

}
