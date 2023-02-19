package com.example.ECommerceApi.controller;

import com.example.ECommerceApi.model.User;
import com.example.ECommerceApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserService service;

    @GetMapping(value = "getAllUsers")
    public List<User> getAllUsers(){
        return service.getAllUser();
    }

    @GetMapping(value = "getUserById")
    public User getUserById(@RequestParam int userId){
        return service.getUserById(userId);
    }
}
