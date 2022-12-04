package com.ding.solarmanagesystem.user.exception;

public class AdministratorAlreadyExistsException extends RuntimeException{

    public AdministratorAlreadyExistsException() {
        super("This Register is not possible, because this email already exists!");
    }

}
