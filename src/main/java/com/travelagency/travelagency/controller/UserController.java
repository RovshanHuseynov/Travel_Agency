package com.travelagency.travelagency.controller;

import com.travelagency.travelagency.entity.User;
import com.travelagency.travelagency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/user/{userId}")
    public User get(@PathVariable("userId") int userId){
        return userService.get(userId);
    }

    @PostMapping("/user")
    public User add(@RequestBody User user){
        return userService.add(user);
    }

    @PutMapping("/user")
    public User update(@RequestBody User user){
        return userService.add(user);
    }

    @DeleteMapping("/user/{userId}")
    public String delete(@PathVariable("userId") int userId){
        System.out.println(userId + " will be deleted");
        userService.delete(userId);
        return userId + " is deleted";
    }
}
