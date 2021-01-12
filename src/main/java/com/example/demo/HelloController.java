package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class HelloController {
    @RequestMapping("/home")
    public String home(HttpServletRequest req){

        String name=req.getParameter("name");
        System.out.println("Hi"+name);
       HttpSession session=req.getSession();
       session.setAttribute("name",name);
        return "home";

    }



}