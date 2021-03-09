package com.cg.eis.exception;

public class Employee {
	
	private String empName;
	private int empId;
	private double empSalary;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) throws EmployeeException{
		if(empSalary<3000)
			throw new EmployeeException();
			
		this.empSalary = empSalary;
	}

}
