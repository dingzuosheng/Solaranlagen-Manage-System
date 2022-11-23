package com.ding.solarmanagesystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Address {
    private String city;
    private String street;
    private String houseNumber;
    private String postcode;
}
