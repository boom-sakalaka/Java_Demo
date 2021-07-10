package com.imooc.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodChecker {
    ////ProceedingJoinPoint是JoinPoint的升级版,在原有功能外,还可以控制目标方法是否执行
    public Object check(ProceedingJoinPoint pjp) throws Throwable {
        try {
            long startTime = new Date().getTime();
            Object ret = pjp.proceed();//执行目标方法
            long endTime = new Date().getTime();
            long duration = endTime - startTime; //执行时长
            if(duration >= 1000){
                String className = pjp.getTarget().getClass().getName();
                String methodName = pjp.getSignature().getName();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
                String now = sdf.format(new Date());
                System.out.println("=======" + now + ":" + className + "." + methodName + "(" + duration + "ms)======");
            }
            return ret;
        } catch (Throwable throwable) {
            System.out.println("Exception message:" + throwable.getMessage());
            throw throwable;
        }
    }
}
