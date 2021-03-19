package com.cg.sl1.beans;

public class Employee3 {
	
	private int employeeId;
	private String employeeName;
	private double salary;
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
	 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee2 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+  ", age=" + age + "]";
	}
	
	

}
