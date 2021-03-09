package com.cg.pl;

import java.util.Scanner;

import com.cg.bean.Employee;
import com.cg.config.EmployeeData;
import com.cg.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeServiceImpl es=new EmployeeServiceImpl();
		EmployeeData data=new EmployeeData();
		for(Employee e:data.getEmpList().values()) {
			es.getInsuranceScheme(e);
		}
		Scanner s=new Scanner(System.in);
		String ch="yes";
		while(ch.equalsIgnoreCase("Yes")) {
			System.out.println("Enter 1 to add the Employee");
			System.out.println("Enter 2 to get Employee with insurance Scheme");
			System.out.println("Enter 3 to delete an employee");
			System.out.println("Enter 4 to display all Employees");
			int a=s.nextInt();
			switch(a){
				case 1:
					System.out.println("Enter Employee ID");
					int id=s.nextInt();
					System.out.println("Employee Name");
					String name=s.next();
					System.out.println("Employee");
					double salary=s.nextDouble();
					String designation=s.next();
					System.out.println(es.addEmployee(id, name, salary, designation));
					break;
				case 2:
					System.out.println("Enter Employee scheme");
					String scheme=s.next();
					for(Employee e:es.getEmployee(scheme))
						System.out.println(e);
					break;
				case 3:
					System.out.println("Enter Employee Id");
					int id1=s.nextInt();
					System.out.println(es.deleteEmployee(id1));
					break;
				case 4:
					for(Employee e:es.displayEmployee())
						System.out.println(e);
					break;
				default:
					System.out.println("Try again");
			}
			System.out.println("Would you like to continue");
			ch=s.next();
		}

	}

}
