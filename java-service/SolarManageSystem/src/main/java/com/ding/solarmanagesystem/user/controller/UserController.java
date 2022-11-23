package com.ding.solarmanagesystem.user.controller;

import com.ding.solarmanagesystem.model.CustomerRegisterRequest;
import com.ding.solarmanagesystem.model.RegisterRequest;
import com.ding.solarmanagesystem.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/user")
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/customer/register")
    public void register(@RequestBody CustomerRegisterRequest request){
        userService.register(request);
    }

}
