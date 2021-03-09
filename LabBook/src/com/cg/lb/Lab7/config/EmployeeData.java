package com.cg.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.bean.Employee;
import com.cg.service.EmployeeServiceImpl;

public class EmployeeData {
	public static HashMap<Integer, Employee> n;
	EmployeeServiceImpl es=new EmployeeServiceImpl();
	static {
		n=new HashMap<Integer, Employee>();
		n.put(101,new Employee(101,"Ramu",30000,"Programmer"));
		n.put(102,new Employee(102,"Rahul",35000,"Programmer"));
		n.put(103,new Employee(103,"Jansi",15000,"System Associate"));
		n.put(104,new Employee(104,"Pruthvi",50000,"Manager"));
		n.put(105,new Employee(105,"Raju",3000,"Clerk"));
	}
	
	public static HashMap<Integer, Employee> getEmpList(){
		return n;
	}
}
