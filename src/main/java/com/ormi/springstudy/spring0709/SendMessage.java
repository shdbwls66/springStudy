package com.ormi.springstudy.spring0709;

import org.springframework.stereotype.Component;

@Component
public class SendMessage implements Message{

    @Override
    public void print() {
        System.out.println("Hello World2!!");
    }
}
