package com.cg.eis.exception;
import java.util.Scanner;
public class Excercise3 {

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		int empId;
		String empName;
		double empSalary;
		
		System.out.println("Enter the Employee ID");
		empId=scan.nextInt();
		System.out.println("Enter the Employee Name");
		empName=scan.next();
		System.out.println("Enter the Employee Salary");
		empSalary=scan.nextDouble();
		
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		try {
			emp.setEmpSalary(empSalary);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
