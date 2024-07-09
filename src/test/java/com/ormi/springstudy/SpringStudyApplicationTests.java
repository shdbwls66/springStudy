package com.ormi.springstudy;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@SpringBootApplication
class SpringStudyApplicationTests {

    @Value("${server.port}")
    private int port;

    @Value("${spring.application.name}")
    private String appName;

    @PostConstruct
    public void printConfig() {
        System.out.println("포트번호: " + port);
        System.out.println("애플리케이션 이름: " + appName);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringStudyApplicationTests.class, args);
    }


}
