package org.spring.springaop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Before("execution(public void org.spring.springaop.service.UserService.save(org.spring.springaop.entity.User))")
    public void beforeSaveLoggingAdvice(){
        log.info("User saved to database");
    }
}
