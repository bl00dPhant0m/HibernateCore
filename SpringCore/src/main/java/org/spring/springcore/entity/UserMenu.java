package org.spring.springcore.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserMenu {
    private UserService userService;

    public UserMenu(@Qualifier("userServiceImpl1") UserService userService) {
        this.userService = userService;
    }

    public boolean addUser(User user){
        if (userService.isNull(user)){
            System.out.println("User не был добавлен");
            return false;
        }
        System.out.println("User был добавлен");
        return true;
    }

    public boolean regestrationOfUser(User user){
        if (userService.isCorrectName(user)){
            System.out.println("User успешно зарегистрирован");
            return true;
        }
        System.out.println("User не успешно зарегистрирован");
        return false;
    }
}
