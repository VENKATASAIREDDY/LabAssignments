package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise4 {

	public static HashMap<Integer, String> getStudents(HashMap<Integer,Integer> a){
		HashMap<Integer,String> n=new HashMap<Integer,String>();
		for(Map.Entry<Integer, Integer> j:a.entrySet()) {
			int mark=j.getValue();
			if(mark>=90)
				n.put(j.getKey(), "Gold");
			else if(mark>=80 && mark<90)
				n.put(j.getKey(), "Silver");
			else if(mark>=70 && mark<80)
				n.put(j.getKey(), "Bronze");
			else
				n.put(j.getKey(), "No Medal");
			
		}
		return n;
	}
	
	public static void main(String[] args) {
		HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
		a.put(10001, 76);
		a.put(10002, 89);
		a.put(10003, 98);
		a.put(10004, 69);
		System.out.println(getStudents(a));
	}

}
