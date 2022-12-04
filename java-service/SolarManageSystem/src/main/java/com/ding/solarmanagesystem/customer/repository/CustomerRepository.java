package com.ding.solarmanagesystem.customer.repository;

import com.ding.solarmanagesystem.model.database.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer,Long> {

    Optional<Customer> findByEmail(String email);
    Optional<Customer> findByTelephoneNumber(String telephoneNumber);
    Optional<Customer> findByBankAccount(String bankAccount);
}
