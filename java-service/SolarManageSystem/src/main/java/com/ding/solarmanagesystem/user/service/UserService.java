package com.ding.solarmanagesystem.user.service;

import com.ding.solarmanagesystem.model.RegisterRequest;
import com.ding.solarmanagesystem.user.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {

    @Override
    public void register(RegisterRequest request) {

    }

    @Override
    public UserDto login() {
        return null;
    }
}
