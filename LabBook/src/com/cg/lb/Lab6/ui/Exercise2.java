package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
	
	public static Map<Character, Integer> countChars(char[] arr){
		Map<Character, Integer> a=new HashMap<Character,Integer>();
		
		for(char i:arr) {
			if(a.containsKey(i))
				a.put(i, a.get(i)+1);
			else
				a.put(i, 1);
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the characters");
		String s=scan.next();
		char c[]=s.toCharArray();
		System.out.println(countChars(c));

	}

}
