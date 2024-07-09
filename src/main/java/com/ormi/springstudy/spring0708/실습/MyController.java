package com.ormi.springstudy.spring0708.실습;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
public class MyController {
//    private final MyService myService;

//    @Autowired
//    public MyController(MyService myService) {
//        this.myService = myService;
//    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

//    public void saveUser(){
//        MyUser myUser = new MyUser("orimi@gmail.com", "오르미", 25);
//        myService.insertUser(myUser);
//    }

//    @GetMapping("/user/name")
//    public List<MyUser> findUser(){
//        return myService.findByName("오르미");
//    }
}
