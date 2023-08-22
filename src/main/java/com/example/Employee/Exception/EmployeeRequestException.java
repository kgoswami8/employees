package com.example.Employee.Exception;

public class EmployeeRequestException extends RuntimeException{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmployeeRequestException(String message) {
		super(message);
	}


}
