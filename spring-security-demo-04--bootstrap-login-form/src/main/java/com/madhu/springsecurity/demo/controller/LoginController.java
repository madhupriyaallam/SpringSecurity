package com.madhu.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showMyLoginPage") // should be same as fun parameter of login-page in security config file
    public String showMyLoginPage(){
        return "fancy-login";
    }
}
