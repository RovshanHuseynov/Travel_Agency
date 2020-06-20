package com.travelagency.travelagency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/main")
    public String method(Model model){
        System.out.println("afaf");
        return "hello";
    }
}
