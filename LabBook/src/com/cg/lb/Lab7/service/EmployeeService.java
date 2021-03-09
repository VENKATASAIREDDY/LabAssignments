package com.cg.service;

import java.util.ArrayList;
import java.util.Collection;

import com.cg.bean.Employee;

public interface EmployeeService {
	public String getInsuranceScheme(Employee emp);
	public String addEmployee(int id,String name,double salary, String designation);
	public ArrayList<Employee> getEmployee(String scheme); 
	public String deleteEmployee(int e);
	public Collection<Employee> displayEmployee();
}
