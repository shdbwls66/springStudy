package com.ormi.springstudy.spring0708.실습;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "myuser")
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private int age;

    public MyUser(String email, String name, int age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }
}