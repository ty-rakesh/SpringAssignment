package com.tyss.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		Byid1 b1=new Byid1();
		ByName1 n1=new ByName1();
		
		MapStudent m1=new MapStudent(10, "dtiger", 12.00);
		MapStudent m2=new MapStudent(20, "ftiger", 12.00);
		MapStudent m3=new MapStudent(40, "etiger", 102.00);
		MapStudent m4=new MapStudent(50, "ctiger", 112.00);
		MapStudent m5=new MapStudent(30, "atiger", 132.00);
		TreeMap<MapStudent, String> tm=new TreeMap<MapStudent,String>(n1);
		
		tm.put(m1, "kohli");
		tm.put(m2, "dhoni");
		tm.put(m3, "chahal");
		tm.put(m4, "rohit");
		tm.put(m5, "jaddu");
		
		//tm.put(60, "ABD");
		
		
		for(Map.Entry I : tm.entrySet()){
			System.out.println(I);
//			System.out.println(I.getKey());
//			System.out.println(I.getValue());
		}
		
		
		
		

	}

}
