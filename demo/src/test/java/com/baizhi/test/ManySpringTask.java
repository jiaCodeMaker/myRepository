package com.baizhi.test;

import com.sun.xml.internal.rngom.binary.DataExceptPattern;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Async//标记异步线程
public class ManySpringTask {
    @Scheduled(fixedDelay = 3000)
    public void test0() throws InterruptedException {
        System.out.println("task1:"+new Date());
        //获取当前线程
        Thread thread = Thread.currentThread();
        Thread.sleep(5000);
        System.out.println(thread.getName());
    }
    public void test2(){
        System.out.println("task2:"+new Date());
    }
}
