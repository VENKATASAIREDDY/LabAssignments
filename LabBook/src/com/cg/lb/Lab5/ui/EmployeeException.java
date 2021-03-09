package com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	public String toString() {
		return "(EXCEPTION): Employee Salary must be above 3000";
	}

}
