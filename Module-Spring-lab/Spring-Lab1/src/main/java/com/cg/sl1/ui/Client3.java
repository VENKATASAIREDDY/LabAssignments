package com.cg.sl1.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.sl1.beans.SBU3;

public class Client3 {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("employeeBean3.xml");
		SBU3 employ = (SBU3)context.getBean("sbu3");
		System.out.println(employ);
		
		((AbstractApplicationContext) context).close();
	}
}
