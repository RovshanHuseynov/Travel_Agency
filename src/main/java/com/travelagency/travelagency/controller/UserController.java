package com.travelagency.travelagency.controller;

import com.travelagency.travelagency.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/main")
    public User method(){
        return new User("User1");
    }
}
