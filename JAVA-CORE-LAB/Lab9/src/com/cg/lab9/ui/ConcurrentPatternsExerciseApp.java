package com.cg.lab9.ui;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConcurrentPatternsExerciseApp {

	public static boolean isValid(String userName) {
		//boolean isValid=false;
		Pattern userNamePattern=Pattern.compile("[A-Za-z]{8,}_job$");
		Matcher userNameMatcher=userNamePattern.matcher(userName);
		return userNameMatcher.matches();
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the User Name : ");
		String userName=scan.next();
		if(isValid(userName)) {
			System.out.println("UserName Accepted");
		}else {
			System.out.println("UserName Rejected");
		}

		scan.close();
	}

}
