package org.spring.springaop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.spring.springaop.entity.User;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class ExceptionAspect {

    @Around("execution(public void org.spring.springaop.service.UserService.save(org.spring.springaop.entity.User))")
    public void aroundExceptionAdvice(ProceedingJoinPoint joinPoint) throws Throwable {

       try {
           joinPoint.proceed();
       }catch (Exception e) {
           log.error(e.getMessage());
       }
    }
}
