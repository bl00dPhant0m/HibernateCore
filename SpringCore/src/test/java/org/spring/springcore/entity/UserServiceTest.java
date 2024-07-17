package org.spring.springcore.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserService2Test {
    UserService userService = new UserServiceImpl2();

    @Test
    void isNull() {
    }

    @Test
    void isCorrectName() {
        User user = new User(1, "цившгфу");
        assertTrue(userService.isCorrectName(user));

    }
}