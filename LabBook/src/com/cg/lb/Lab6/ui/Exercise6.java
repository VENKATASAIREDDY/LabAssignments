package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6 {
	
	public static List votersList(HashMap<Integer,Integer> a) {
		List<Integer> n=new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> i:a.entrySet()) {
			if(i.getValue()>18)
				n.add(i.getKey());
		}
		return n;
	}

	public static void main(String[] args) {
		HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
		a.put(10001, 21);
		a.put(10002, 17);
		a.put(10003, 39);
		a.put(10004, 65);
		a.put(10005, 28);
		System.out.println(votersList(a));
		
	}

}
