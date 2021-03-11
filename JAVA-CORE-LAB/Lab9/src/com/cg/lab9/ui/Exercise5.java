package com.cg.lab9.ui;

import java.util.Scanner;

import com.cg.lab9.service.Factorial;
import com.cg.lab9.service.IFindFactorial;

public class Exercise5 {
    public static void main(String[] args) {
    	Factorial fact=new Factorial();
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the Number : ");
    	int number=scan.nextInt();
        fact.setFact(number);
        IFindFactorial factorial=fact::getFactorial;
        int factorialOfNumber=factorial.getFactorial(number);
        System.out.println("The Factorial of "+number+" is : "+factorialOfNumber);
        
        scan.close();
    }
}
