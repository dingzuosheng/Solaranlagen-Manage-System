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
    private String city;
    private String street;
    private String houseNumber;
    private String postcode;
    private String telephoneNumber;
    private String bankAccount;
    private int numberOfResidents;
}
