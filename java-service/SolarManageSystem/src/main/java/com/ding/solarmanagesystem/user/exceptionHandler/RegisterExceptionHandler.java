package com.ding.solarmanagesystem.user.exceptionHandler;

import com.ding.solarmanagesystem.user.dataTransferObject.ErrorDto;
import com.ding.solarmanagesystem.user.exception.AdministratorAlreadyExistsException;
import com.ding.solarmanagesystem.user.exception.CustomerAlreadyExistsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
@ResponseBody
@Slf4j
public class RegisterExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({AdministratorAlreadyExistsException.class})
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDto handleAdministratorAlreadyExistsException(AdministratorAlreadyExistsException exception){
        return new ErrorDto(exception.getMessage());
    }
    @ExceptionHandler({SQLIntegrityConstraintViolationException.class})
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDto handleAdministratorAlreadyExistsException(SQLIntegrityConstraintViolationException exception){
        return new ErrorDto("This Register is not possible, because this email already exists!");
    }

    @ExceptionHandler(CustomerAlreadyExistsException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDto handleCustomerAlreadyExistsException(CustomerAlreadyExistsException exception){
        return new ErrorDto(exception.getMessage());
    }
}
