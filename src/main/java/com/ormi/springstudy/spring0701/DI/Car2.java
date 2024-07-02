package com.ormi.springstudy.spring0701.DI;

import org.springframework.stereotype.Component;


public class Car2 implements CarInterface {
    @Override
    public void run() {
        System.out.println("Car2가 달립니다.");
    }

//    private Engine engine;
//
//    @Autowired
//    public Car2(Engine engine) { // 외부에서 객체를 받음.
//        this.engine = engine;
//    }

}
