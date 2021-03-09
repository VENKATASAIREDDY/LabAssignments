package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	
	public static Map<Integer, Integer> getSquares(int[] a){
		Map<Integer, Integer> n=new HashMap<Integer,Integer>();
		for(int i:a) {
			n.put(i,i*i);
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Length of the array");
		int l=scan.nextInt();
		int a[]=new int[l];
		for(int i=0;i<l;i++) {
			a[i]=scan.nextInt();
		}
		
		System.out.println(getSquares(a));
		
		
	}

}
