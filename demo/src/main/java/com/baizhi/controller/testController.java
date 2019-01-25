package com.baizhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {
    @RequestMapping("/test01")
    public void testaa(){
        System.out.println("哈哈哈哈没拦住");
    }

    @RequestMapping("/test02")
    public void testbbb(){
        System.out.println("我成功通过拦截器了");
    }
}
