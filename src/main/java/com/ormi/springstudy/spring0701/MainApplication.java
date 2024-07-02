package com.ormi.springstudy.spring0701;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@SpringBootApplication
//@Component
//@ComponentScan(basePackages = "com.ormi.springstudy.spring0701")
public class MainApplication {
    public static void main(String[] args) {


//        SpringApplication.run(MainApplication.class, args);

//        User model = new User("max@gmail.com", "노유진", 25);
//        UserView userView = new UserView();
//        UserController userController = new UserController(model, userView);
//
//        userController.updateView();
//        userController.setUserName("김삿갓");
//        userController.setUserAge(24);
//        System.out.println("===========================");
//        userController.updateView();

        SpringApplication.run(MainApplication.class, args);
    }
}
