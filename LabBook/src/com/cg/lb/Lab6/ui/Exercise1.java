package com;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Exercise1 {
	
	public static List getValues(HashMap a) {
		List l=new LinkedList(a.values());
		Collections.sort(l);
		return l;
		
	}

	public static void main(String[] args) {
		
		HashMap n=new HashMap();
		n.put("Ajay", 457);
		n.put("Kumar", 57);
		n.put("Likith", 47);
		n.put("Anoy", 45);
		List l=getValues(n);
		System.out.println(l);

	}

}
