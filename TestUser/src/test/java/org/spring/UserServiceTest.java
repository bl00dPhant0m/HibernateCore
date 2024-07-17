package org.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserServiceTest {
    private UserService userService;
    private User user;
    @BeforeEach
    public void setUp() {
        userService = new UserService();
        user = new User(3, "ekjnfs", " jnsef");
        userService.addUser(user);
    }

    @Test
    public void testAddUser() {
        Assertions.assertTrue(userService.addUser(new User(2, "saaw", "wdad")));
    }

    @Test
    public void testGetUserByIndex() {
        Assertions.assertEquals(user, userService.getUserByIndex(0));
    }

    @Test
    public void testGetUserById() {
        Assertions.assertEquals(user, userService.getUserById(3));
    }

    @Test
    public void testNotFoundUserById(){
        Assertions.assertNull(userService.getUserById(-1));
    }

    @Test
    public void testCountOfUsers(){
        Assertions.assertEquals(1, userService.countOfUsers());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14})
    public void testRemoveAll(int n){
        userService.removeAll();
        Assertions.assertNull(userService.getUserByIndex(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 4, 5, 6, 7, 8})
    public void testNotHaveUsers(int n){
        Assertions.assertFalse(userService.haveUser(n));
    }

    @Test
    public void testHaveUser(){
        Assertions.assertTrue(userService.haveUser(3));
    }
}
