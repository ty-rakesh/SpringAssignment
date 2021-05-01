package com.tyss.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashsetStudentDemo {

	public static void main(String[] args) {
		
		ById b=new ById();
		HashSet<HashsetStudent> hs=new HashSet<HashsetStudent>();
		
		HashsetStudent stu1=new HashsetStudent(10,"ramesh",90);
		HashsetStudent stu2=new HashsetStudent(20,"suresh",80);
		HashsetStudent stu3=new HashsetStudent(30,"rakesh",70);
		HashsetStudent stu4=new HashsetStudent(40,"naresh",60);
		HashsetStudent stu5=new HashsetStudent(50,"veeresh",100);
		HashsetStudent stu6=new HashsetStudent(40, "name", 84);
		
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		hs.add(stu4);
		hs.add(stu5);
		hs.add(stu6);
		
		System.out.println("before sorting");
		System.out.println(hs);
   
		ArrayList a=new ArrayList<>(hs);
		Collections.sort(a);
		System.out.println("after sorting");
		System.out.println(a);
		
	}

}
