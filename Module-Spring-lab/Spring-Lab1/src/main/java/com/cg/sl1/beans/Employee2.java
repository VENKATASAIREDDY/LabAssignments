package com.cg.sl1.beans;

public class Employee2 {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU2 businessUnit;
	private int age;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	 public SBU2 getBusinessUnit() { 
		 return businessUnit; 
	 } 
	 public void setBusinessUnit(SBU2 businessUnit) { 
		 this.businessUnit = businessUnit; 
	 }
	 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee2 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + businessUnit.getSbuID() + ", age=" + age + "]";
	}
	
	

}
