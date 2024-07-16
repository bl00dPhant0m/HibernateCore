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

    @Around(value = "execution(**(..))")
    public Object aroundLogExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        System.out.println("d");
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println(joinPoint.getSignature().getDeclaringTypeName() + "."
                + joinPoint.getSignature().getName()
                +"execution time is "+executionTime+"ms");
        return result;
    }
}
