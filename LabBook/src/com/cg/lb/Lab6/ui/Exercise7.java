package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
	
	public static int[] getSorted(int[] a) {
		int l=a.length;
		String str="";
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<l;i++) {
			str=""+a[i];
			StringBuilder temp=new StringBuilder(str);
			temp.reverse();
			li.add(Integer.parseInt(temp.toString()));
		}
		Collections.sort(li);
		int[] result=new int[li.size()];
		for(int j=0;j<li.size();j++) {
			result[j]=li.get(j);
		}
		return result;
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
		int[] result=getSorted(a);
		for(int i:result)
			System.out.println(i);

	}

}
