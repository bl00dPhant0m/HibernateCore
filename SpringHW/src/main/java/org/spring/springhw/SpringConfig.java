package org.spring.springhw;

import org.spring.springhw.classes.Smartphone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring.springhw")
public class SpringConfig {
    @Bean
    Smartphone smartphone1(){
        return new Smartphone("Apple", "89756574215");
    }

    @Bean
    Smartphone smartphone2(){
        return new Smartphone("Samsung", "89998887766");
    }
}
