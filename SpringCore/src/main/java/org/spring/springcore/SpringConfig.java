package org.spring.springcore;


import org.spring.springcore.entity.Company;
import org.spring.springcore.entity.Emploe;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("org.spring.springcore")
public class SpringConfig {

    @Bean
    Company company(List<Emploe> list1){
       return new Company("Google","Street lenina",list1);
    }

    @Bean
    @Scope("prototype")
    Company company2(@Qualifier("list2") List<Emploe> emploeList){
        return new Company("BBC","Street lenina", emploeList);
    }

    @Bean
    Emploe emploe(){
        return new Emploe(200_000, "Nikita");
    }

    @Bean
    Emploe emploe2(){
        return new Emploe(250_000, "Vladimir");
    }

    @Bean("list1")
    List<Emploe> emploeList1(){
        List<Emploe> list = new ArrayList<Emploe>();
        list.add(new Emploe(200_000, "Nikita"));
        list.add(new Emploe(250_000, "Vladimir"));
        return list;

    }

    @Bean("list2")
    List<Emploe> emploeList2(){
        List<Emploe> list = new ArrayList<Emploe>();
        list.add(new Emploe(1200_000, "Nikita"));
        list.add(new Emploe(1250_000, "Vladimir"));
        return list;

    }



}
