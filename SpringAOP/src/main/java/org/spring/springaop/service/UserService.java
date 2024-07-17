package org.spring.springaop.service;

import lombok.extern.slf4j.Slf4j;
import org.spring.springaop.db.UserDB;
import org.spring.springaop.entity.User;
import org.springframework.stereotype.Component;

@Slf4j

@Component
public class UserService {

    public void save(User user) {
        if (user.getId() <=0) throw new RuntimeException("Неверно указан id");
        UserDB.addToList(user);



        System.out.println("start save user");
    }

    public User get(int id){
        System.out.println("start get user");
        return UserDB.getUser(id);
    }
}
