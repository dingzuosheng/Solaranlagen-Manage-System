package com.ding.solarmanagesystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AdministratorRegisterRequest implements RegisterRequest{
    private String firstname;
    private String lastname;
    private String password;
    private String email;
}
