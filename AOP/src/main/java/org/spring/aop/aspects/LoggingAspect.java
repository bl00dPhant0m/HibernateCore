package org.spring.aop.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Aspect
public class LoggingAspect {


    //@Around("@annotation(org.spring.aop.annotations.Loggable)")
    @Around("execution(* *(..)) && @within(org.spring.aop.annotations.Loggable)")
    public Object aroundLogExecutionTimeAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        log.info(joinPoint.toLongString()
                +" execution time is "+executionTime+"ms");
        return result;
    }
}
