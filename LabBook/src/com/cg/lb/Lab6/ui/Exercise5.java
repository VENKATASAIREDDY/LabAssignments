package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	
	public static int getSecondSmallest(int[] a) {
		List<Integer> l=new ArrayList<Integer>();
		for(int i:a)
			l.add(i);
		Collections.sort(l);
		return l.get(1);
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Length of the array");
		int l=scan.nextInt();
		System.out.println("Enter the elements of the array");
		int a[]=new int[l];
		for(int i=0;i<l;i++) {
			a[i]=scan.nextInt();
		}
		
		System.out.println(getSecondSmallest(a));

	}

}
