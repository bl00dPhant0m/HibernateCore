package org.spring.springcore.entity;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl2 implements UserService {
    public boolean isNull(User user) {
        return user == null;
    }

    public boolean isCorrectName(User user) {
        return user.getName().matches("^[a-zA-Zа-яА-Я]+$");
    }
}
