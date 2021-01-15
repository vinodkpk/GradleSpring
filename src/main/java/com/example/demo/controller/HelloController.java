package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/home")
    public String home(Model model){
model.addAttribute("home", "Welcome to Spring Boot");
        return "home";

    }

}
