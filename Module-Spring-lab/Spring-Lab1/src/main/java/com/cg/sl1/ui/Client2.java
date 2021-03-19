package com.cg.sl1.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.sl1.beans.Employee2;
import com.cg.sl1.beans.SBU2;

public class Client2 {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("employeeBean2.xml");
		SBU2 employ = (SBU2)context.getBean("sbu2");
		Employee2 employee=(Employee2) context.getBean("employee2");
		System.out.println(employee);
		System.out.println(employ);
		
		((AbstractApplicationContext) context).close();
	}
}
