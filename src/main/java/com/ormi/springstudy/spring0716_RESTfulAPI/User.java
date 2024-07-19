package com.ormi.springstudy.spring0716_RESTfulAPI;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    public Long id;
    private String name;
    private String password;
}
