package com.cg.sl1.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.sl1.beans.Employee;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("employeeBean1.xml");
//		SBU employ = (SBU)context.getBean("sbu");
		Employee employ=(Employee) context.getBean("employee");
		System.out.println(employ);
		
		((AbstractApplicationContext) context).close();
	}
}
