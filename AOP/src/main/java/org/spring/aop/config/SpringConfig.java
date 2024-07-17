package org.spring.aop.config;

import org.spring.aop.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring.aop")
public class SpringConfig {
    @Bean
    User user(){
        return new User("Nikolay", 25);
    }
}
