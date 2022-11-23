package com.ding.solarmanagesystem.user.service;

import com.ding.solarmanagesystem.model.RegisterRequest;
import com.ding.solarmanagesystem.user.dto.UserDto;

public interface UserServiceInterface {
    public void register(RegisterRequest request);
    public UserDto login();
}
