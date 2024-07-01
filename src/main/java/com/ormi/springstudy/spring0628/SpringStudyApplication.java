package com.ormi.springstudy.spring0628;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringStudyApplication {

    @Value("${kakao.api.key}")
    private String name;

    public static void main(String[] args) {

        UserRepositoryInterface userRepository = new UserRepository();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println("=====================");
        System.out.println(singleton1);
        System.out.println("=====================");
        System.out.println(singleton2);

//        SpringApplication.run(SpringStudyApplication.class, args);
    }

}
