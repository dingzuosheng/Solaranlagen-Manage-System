package com.ding.solarmanagesystem.model;

import com.ding.solarmanagesystem.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Role {

    private int id;

    private String name;

    private User user;
}
