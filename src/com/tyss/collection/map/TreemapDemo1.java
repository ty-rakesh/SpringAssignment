package com.tyss.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo1 {

	public static void main(String[] args) {
		TreeMap<TStudents, String> tm=new TreeMap<>();
		
		TStudents stu1=new TStudents(10,"ramesh",90);
		TStudents stu2=new TStudents(20,"suresh",80);
		TStudents stu3=new TStudents(30,"rakesh",70);
		TStudents stu4=new TStudents(40,"naresh",60);
		TStudents stu5=new TStudents(50,"veeresh",100);
		TStudents stu6=new TStudents(40, "name", 84);
		
		tm.put(stu1, "blore");
		tm.put(stu2, "mlore");
		tm.put(stu3, "belgavi");
		tm.put(stu4, "bombay");
		tm.put(stu5, "hyderbad");
	    tm.put(stu6, "delhi");
	//	System.out.println(tm);
		
		for(Map.Entry<TStudents, String> s:tm.entrySet()){
		System.out.println(s.getKey().id+" "
                + s.getKey().name + " "
                + s.getValue());

	}
	}
}
