package com.ormi.springstudy.spring0701;

import java.util.Scanner;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserView {
    public void printUserDetails(User user){
        System.out.println("User details: ");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Age: " + user.getAge());
    }

    public void inputUserDetails(User user){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        user.setName(sc.nextLine());

        
    }
}
