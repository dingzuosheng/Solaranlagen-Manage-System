package com.ding.solarmanagesystem.model;

import com.ding.solarmanagesystem.user.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class User {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;

    public abstract void register(RegisterRequest request);
    public abstract UserDto login();
}
