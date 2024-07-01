package com.ormi.springstudy.spring0701;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@AllArgsConstructor
//@RestController
public class UserController {
    private final UserService userService;

//    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/max")
    public String getUserResult() {
        return userService.getUser();
    }

    @GetMapping("/user")
    public String getUser() {
        return "Hello";
    }

//    private User model;
//    private UserView view;
//
//    public void updateView() {
//        view.printUserDetails(model);
//    }
//
//    public void setUserName(String name) {
//        model.setName(name);
//    }
//
//    public void setUserAge(int age) {
//        model.setAge(age);
//    }

}
