package org.spring.springcore.entity;

import org.springframework.stereotype.Component;


public interface UserService {
    boolean isNull(User user);

    boolean isCorrectName(User user);
}
