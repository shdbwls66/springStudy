package com.ormi.springstudy.spring0708.실습3;

import org.springframework.web.servlet.DispatcherServlet;

public class MainApplication3 {
    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        String url = "/hello";

        MockHttpServletRequest request = new MockHttpServletRequest(url);
        MockHttpServletResponse response = new MockHttpServletResponse();

//        dispatcherServlet.service(request, response);

        System.out.println(response.getContent());
        System.out.println("응답 내용: " + response.getContent());

    }
}
