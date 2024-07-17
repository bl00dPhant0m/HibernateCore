package org.spring.springcore.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserServiceImpl1Test {

    UserService userService = new UserServiceImpl1();
    User user = new User(1, "аовыь_name");

    @Test
    void isNull() {
        assertFalse(userService.isNull(user));
    }

    @Test
    void isCorrectName() {

        assertTrue(userService.isCorrectName(user));
    }

    @Test
    void isNotCorrectName(){
        user.setName("sdfe");
        assertFalse(userService.isCorrectName(user));
    }
}