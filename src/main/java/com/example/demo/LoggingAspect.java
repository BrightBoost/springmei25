package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    @Before("execution(* com.example.demo.*.*(..))")
    public void logBeforeEndpoint(JoinPoint joinPoint) {
        System.out.println("Before: " + joinPoint.getSignature().getName());
    }

    @After("@annotation(com.example.demo.Loggable)")
    public void logSomethingAfter(JoinPoint joinPoint) {
        System.out.println("Annotation loggable in action! On: " + joinPoint.getSignature().getName());
    }

}
