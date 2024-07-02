package com.ormi.springstudy.spring0701.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Driver {
    private CarInterface carInterface;

    @Autowired
    public Driver(@Qualifier("car") CarInterface carInterface) {
        this.carInterface = carInterface;
    }
}
