package com.ormi.springstudy.spring0701;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

//@Repository
public class UserRepository {

    Map<String, User> users = new HashMap<>();


    public User getUser() {
        users.put("max", new User("max@gmail.com", "Max", 20));
        return users.get("max");
    }
}
