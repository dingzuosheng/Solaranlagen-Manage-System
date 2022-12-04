package com.ding.solarmanagesystem.user.service;

import com.ding.solarmanagesystem.user.exception.CustomerAlreadyExistsException;
import com.ding.solarmanagesystem.customer.repository.CustomerRepository;
import com.ding.solarmanagesystem.model.AdministratorRegisterRequest;
import com.ding.solarmanagesystem.model.CustomerRegisterRequest;
import com.ding.solarmanagesystem.model.database.Administrator;
import com.ding.solarmanagesystem.model.database.Customer;
import com.ding.solarmanagesystem.user.dataTransferObject.UserDto;
import com.ding.solarmanagesystem.user.exception.AdministratorAlreadyExistsException;
import com.ding.solarmanagesystem.user.repository.AdministratorRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserServiceInterface {

    private AdministratorRepository administratorRepository;
    private CustomerRepository customerRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public UserService(AdministratorRepository administratorRepository, CustomerRepository customerRepository) {
        this.administratorRepository = administratorRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void registerAdministrator(AdministratorRegisterRequest request) {
        Administrator administrator = modelMapper.map(request, Administrator.class);
        checkIfAdministratorWithThisExists(administrator.getEmail());
        administratorRepository.save(administrator);
    }


    private void checkIfAdministratorWithThisExists(String email) {
        Optional<Administrator> administrator = administratorRepository.findByEmail(email);
        if (administrator.isPresent()) {
            throw new AdministratorAlreadyExistsException();
        }
    }

    @Override
    public void registerCustomer(CustomerRegisterRequest request) {
        checkIfCustomerWithThisEmailExists(request.getEmail());
        checkIfCustomerWithThisBankAccountExists(request.getBankAccount());
        checkIfCustomerWithThisTelephoneNumberExists(request.getTelephoneNumber());
        Customer customer = modelMapper.map(request,Customer.class);
        customerRepository.save(customer);
    }

    private void checkIfCustomerWithThisEmailExists(String email) {
        Optional<Customer> customer = customerRepository.findByEmail(email);
        if (customer.isPresent()) {
            throw new CustomerAlreadyExistsException("This Customer with Email " + email + "already exists!");
        }
    }

    private void checkIfCustomerWithThisTelephoneNumberExists(String telephoneNumber) {
        Optional<Customer> customer = customerRepository.findByTelephoneNumber(telephoneNumber);
        if (customer.isPresent()) {
            throw new CustomerAlreadyExistsException("This customer with telephoneNumber " + telephoneNumber + "already exists!");
        }
    }

    private void checkIfCustomerWithThisBankAccountExists(String bankAccount) {
        Optional<Customer> customer = customerRepository.findByBankAccount(bankAccount);
        if (customer.isPresent()) {
            throw new CustomerAlreadyExistsException("This customer with bank account " + bankAccount + "already exists!");
        }
    }

    @Override
    public UserDto login() {
        return null;
    }
}
