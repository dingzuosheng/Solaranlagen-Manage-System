package com.ding.solarmanagesystem.customer.service;

import com.ding.solarmanagesystem.user.repository.AdministratorRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private AdministratorRepository customerRepository;

    public CustomerService(AdministratorRepository userRepository){
        this.customerRepository = userRepository;
    }

}
