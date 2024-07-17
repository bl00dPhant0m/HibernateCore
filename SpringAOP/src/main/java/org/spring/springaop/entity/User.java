package org.spring.springaop.entity;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
public class User {
    private int id;
    private String login;
    private String password;
}
