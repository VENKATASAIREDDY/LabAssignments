package com.cg.bean;

import java.util.HashMap;

import com.cg.config.EmployeeData;
import com.cg.service.EmployeeServiceImpl;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	

	public Employee() {
	}
	public Employee(int id, String name, double salary,String designation) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
	}
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme1() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	public String toString(){
		return id+"\t"+name+"\t"+salary+"\t"+designation+"\t"+insuranceScheme;
	}
	
}
