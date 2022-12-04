package com.ding.solarmanagesystem.user.repository;

import com.ding.solarmanagesystem.model.database.Administrator;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdministratorRepository extends CrudRepository<Administrator,Long> {

    Optional<Administrator> findByEmail(String email);
}
