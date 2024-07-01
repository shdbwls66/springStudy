package com.ormi.springstudy.spring0701;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {
    private String email;
    private String name;
    private int age;

}