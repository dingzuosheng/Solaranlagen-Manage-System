package com.ding.solarmanagesystem.user.service;

import com.ding.solarmanagesystem.model.AdministratorRegisterRequest;
import com.ding.solarmanagesystem.model.CustomerRegisterRequest;
import com.ding.solarmanagesystem.user.dataTransferObject.UserDto;

public interface UserServiceInterface {
    public void registerAdministrator(AdministratorRegisterRequest request);
    public void registerCustomer(CustomerRegisterRequest request);
    public UserDto login();
}
