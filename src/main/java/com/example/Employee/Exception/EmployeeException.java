package com.example.Employee.Exception;

public class EmployeeException {

	private String errorMsg;
	private String details;
	
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	public EmployeeException(String errorMsg, String details) {
		super();
		this.errorMsg = errorMsg;
		this.details = details;
	}
	
	
	
}
