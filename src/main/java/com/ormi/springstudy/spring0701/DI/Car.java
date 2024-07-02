package com.ormi.springstudy.spring0701.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Car implements CarInterface{
    @Override
    public void run() {
        System.out.println("Car이 달립니다.");
    }

    private Engine engine;

    @Autowired
    public Car(Engine engine) { // 외부에서 객체를 받음.
        this.engine = engine;
    }
}
