package com.ding.solarmanagesystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class CustomerRegisterRequest implements RegisterRequest{
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private Date birthday;
    private Address address;
    private String telephoneNumber;
    private String bankAccount;
    private int numberOfResidents;
}
