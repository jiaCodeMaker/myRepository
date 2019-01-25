package com.baizhi;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AOP {
    @Before("execution(* com.baizhi.service..*.*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("-------This is before method------");
    }
    @After("execution(* com.baizhi.service..*.*(..))")
    public void after(JoinPoint joinPoint){
        System.out.println("----This is after method-----");
    }
    @Around("execution(* com.baizhi.service..*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        try {
            System.out.println("around--before--");
            Object proceed = proceedingJoinPoint.proceed();
            System.out.println("around--after--");
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
