package com.cg.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.cg.bean.Employee;
import com.cg.config.EmployeeData;

public class EmployeeServiceImpl implements EmployeeService{

	public HashMap<Integer, Employee> empd=EmployeeData.getEmpList();
	@Override
	public String getInsuranceScheme(Employee emp) {
		double sal=emp.getSalary();
		if(sal>=5000 && sal<20000 ) {
			emp.setInsuranceScheme("SchemeC");
			return "SchemeC";
		}
		else if(sal>=2000 && sal<40000) {
			emp.setInsuranceScheme("SchemeB");
			return "SchemeB";
		}
		else if(sal>=40000) {
			emp.setInsuranceScheme("SchemeA");
			return "SchemeA";
		}
		else if(sal<5000) {
			emp.setInsuranceScheme("NoScheme");
			return "NoScheme";
		}
		else {
			emp.setInsuranceScheme(null);
			return null;
		}
	}
	@Override
	public String addEmployee(int id, String name, double salary, String designation) {
		if(!empd.containsKey(id)) {
			empd.put(id, new Employee(id,name,salary,designation));
			getInsuranceScheme(empd.get(id));
			return "Employee added succesfully";
		}
		else
			return "Employee id already taken";

	}
	@Override
	public ArrayList<Employee> getEmployee(String scheme) {
		ArrayList<Employee> l=new ArrayList<Employee>();
		for(Employee e:empd.values()) {
			if((e.getInsuranceScheme1()).equalsIgnoreCase(scheme)) {
				l.add(e);}
		}
		return l;
	}
	@Override
	public String deleteEmployee(int e) {
		if(empd.containsKey(e)) {
			empd.remove(e);
			return "Employee Removed Succesfully";
		}
		else {
			return "Employee not present in the dataset";
		}
			
			
	}
	
	public Collection<Employee> displayEmployee(){
		List<Employee> l=new ArrayList<Employee>(empd.values());
		return l;
	}



}
