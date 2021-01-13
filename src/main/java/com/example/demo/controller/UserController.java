package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.dao.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController{

    @Autowired
    private UserRespository userRespository;
    @GetMapping("users")
    public List<User> getusers(){
        return this.userRespository.findAll();

    }

}
