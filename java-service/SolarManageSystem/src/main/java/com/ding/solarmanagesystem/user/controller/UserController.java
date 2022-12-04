package com.ding.solarmanagesystem.user.controller;

import com.ding.solarmanagesystem.model.AdministratorRegisterRequest;
import com.ding.solarmanagesystem.model.CustomerRegisterRequest;
import com.ding.solarmanagesystem.model.database.Administrator;
import com.ding.solarmanagesystem.user.dataTransferObject.RegisterDto;
import com.ding.solarmanagesystem.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@ResponseBody
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/customer/register")
    @ResponseStatus(code = HttpStatus.CREATED)
    public RegisterDto register(@RequestBody CustomerRegisterRequest request){
        userService.registerCustomer(request);
        return new RegisterDto("Your register is successful!");
    }
    @PostMapping("/administrator/register")
    @ResponseStatus(code = HttpStatus.CREATED)
    public RegisterDto register(@RequestBody AdministratorRegisterRequest request){
        userService.registerAdministrator(request);
        return new RegisterDto("Your register is successful!");
    }


}
