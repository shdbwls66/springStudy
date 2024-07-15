package com.ormi.springstudy.spring0715;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThymeleafController {

    @GetMapping("/index")
    public String index(Model model) {
        User user = new User("yujin", "shdbwls66@naver.com", false, false, "max2");
        int[] iterData = {1, 2, 3, 4, 5};

        model.addAttribute("message1", "Hello, Thymeleaf!");

        model.addAttribute("user", user);
        model.addAttribute("iterData", iterData);

        return "index";
    }

    @GetMapping("/index/2")
    public String index2(Model model) {

        return "index2";
    }

//    @GetMapping("/index/3")
    public String index3(Model model) {

        return "index3";
    }

    @PostMapping("/users")
    public String users(@ModelAttribute User user) {
        System.out.println("유저의 이름은 " + user.getUsername() + " 입니다.");
        System.out.println("유저의 이메일은 " + user.getEmail() + " 입니다.");
        return "index";
    }

//        model.addAttribute("message3", "1번: 얼음이 죽으면?");
//        model.addAttribute("message4", "2번: 귀가 불에 타면?");
//        model.addAttribute("message5", "3번: 사람 잡는 프로그래밍 언어는?");
//
//        model.addAttribute("font_color", "color: white");
//        model.addAttribute("background", "background-color: pink");
//
//        model.addAttribute("firstAns", "다이빙");
//        model.addAttribute("secondAns", "타이어");
//        model.addAttribute("thirdAns", "자바");

//    @GetMapping("/index")
//    public String index(@RequestParam("name") String name, Model model) {
//        model.addAttribute("name1", name);
//        return "index";
//    }
}






