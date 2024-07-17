package org.spring.springaop.db;

import org.spring.springaop.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    private static List<User> users = new ArrayList<User>();

    public static void addToList(User user){
        users.add(user);
    }

    public static User getUser(int id){
        return  users.stream().filter(user -> user.getId() == id).findFirst().get();
    }
}
