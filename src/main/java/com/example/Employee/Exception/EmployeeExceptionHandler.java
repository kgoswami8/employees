package com.example.Employee.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class EmployeeExceptionHandler {
	
	@ExceptionHandler(value= {EmployeeRequestException.class})
	public ResponseEntity<Object> handleEmployeeRequestException(EmployeeRequestException e){
		
		HttpStatus badRequest=HttpStatus.BAD_REQUEST;
	    EmployeeException apiException=new EmployeeException(e.getMessage(),"handling exception");
		return new ResponseEntity<Object>(apiException,badRequest);
	}
}
