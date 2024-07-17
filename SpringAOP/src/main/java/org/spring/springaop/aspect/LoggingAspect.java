package org.spring.springaop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.spring.springaop.entity.User;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Around("execution(public void org.spring.springaop.service.UserService.save(org.spring.springaop.entity.User))")
    public void aroundSaveLoggingAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        String login = ((User) joinPoint.getArgs()[0]).getLogin();
        log.info("User login = "+ login  + " trying to database in method " + joinPoint.getSignature().getName()
                + joinPoint.getSignature().getDeclaringType().getName());
        joinPoint.proceed();
        log.info("User login = "+ login  + " saved to database in method " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(public * org.spring.springaop.service.UserService.get(int))",
    returning = "user")
    public void afterGetUserToDBAdvice(User user) throws Throwable {
        log.info("User get from DB with login = " + user.getLogin());
    }

}
