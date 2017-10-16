package com.zgwei.springmvc.aopbusinessrule;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by zgwei on 2017/9/9.
 */
@Component
@Aspect
public class AudienceAop {

    @Pointcut("execution (* com.zgwei.springmvc.businessrule.Performance.perform(..))")
    public void performance(){}


    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }


//    @Before("performance()")
//    public void silenceCellPhones(){
//        System.out.println("Silencing cell phones");
//    }
//
//    @Before("performance()")
//    public void taskSeats(){
//        System.out.println("Taking seats");
//    }
//
//    @AfterReturning("performance()")
//    public void applause(){
//        System.out.println("CLAP CLAP CLAP!!!");
//    }
//
//    @AfterThrowing("performance()")
//    public void demandRefund(){
//        System.out.println("Demanding a refund");
//    }



}
