package org.spring;

import java.util.Arrays;

public class UserService {
    public User[] users = new User[15];
    private int count = 0;

    public User getUserById(int id) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                return users[i];
            }
        }
        return null;
    }

    public User getUserByIndex(int index){
        return users[index];
    }

    public boolean addUser(User user) {
        if (count == users.length) {
            return false;
        }else {
            users[count] = user;
            count++;
            return true;
        }
    }

    public void removeAll(){
        Arrays.fill(users, null);
        count = 0;
    }

    public int countOfUsers(){
        return count;
    }

    public boolean haveUser(int id) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

}
