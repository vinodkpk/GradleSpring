package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController {
    @RequestMapping("/home")
    public String home(HttpServletRequest req){

        String name=req.getParameter("name");
        System.out.println("Hi"+name);
        HttpSession session=req.getSession();
        session.setAttribute("name",name);
        return "home";

    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/James")
    public String index1() {
        return "Greetings James from Spring Boot!";
    }


}