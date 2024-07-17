package org.spring.springcore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Manager extends Emploe{
    public Manager(@Value("120000") int salary,@Value("FOMA") String name) {
        super(salary, name);
    }
}
