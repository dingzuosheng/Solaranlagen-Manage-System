package com.ding.solarmanagesystem.user.dto;

import com.ding.solarmanagesystem.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private Role role;
}
