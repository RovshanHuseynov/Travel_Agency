package com.travelagency.travelagency.controller;

import com.travelagency.travelagency.entity.User;
import com.travelagency.travelagency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/main")
    public List<User> getAll(){
        return userService.getAll();
    }

    @RequestMapping("/user/{userId}")
    public User get(@PathVariable("userId") int userId){
        return userService.get(userId);
    }
}
