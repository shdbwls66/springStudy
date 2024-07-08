package com.ormi.springstudy.spring0708.실습2.Main;

import com.ormi.springstudy.spring0708.실습2.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ormi.springstudy.spring0708.실습2")
public class MainApplication2 {
    public static void main(String[] args) {
//        MyService myService = new MyService();
//        myService.hello();

        SpringApplication.run(MainApplication2.class, args);

    }
}
