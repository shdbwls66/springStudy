package com.ormi.springstudy;

import com.ormi.springstudy.spring0708.실습2.Main.MainApplication2;
import com.ormi.springstudy.spring0709.Message;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class SpringStudyApplication {
//    private int port;
//    private String appName;

    @Value("${server.port}")
    private int serverPort;

    @Value("${spring.application.name}")
    private String applicationName;

    @PostConstruct
    public void printConfig() {
//        TimeZone.setDefault(TimeZone.getDefault("Asia/Seoul"));
        System.out.println("포트번호: " + serverPort);
        System.out.println("애플리케이션 이름: " + applicationName);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringStudyApplication.class, args);

    }
}
