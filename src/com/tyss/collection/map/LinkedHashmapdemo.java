package com.tyss.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashmapdemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();
		
		m.put(10, "test");
		m.put(50, "tech");
		m.put(20, "yantra");
		m.put(30, "techno");
		m.put(40, "elevat");
		
		m.put(10, "news");

		System.out.println(m);
		System.out.println(m.equals(m));
		System.out.println(m.containsKey(60));
		System.out.println(m.containsValue(58));
		
		
	}

}
