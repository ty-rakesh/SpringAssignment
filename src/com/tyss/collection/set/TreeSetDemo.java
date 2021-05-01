package com.tyss.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		ByPercentage bp=new ByPercentage();
		ByName bn=new ByName();
		ById b=new ById();
		TreeSet<HashsetStudent> t=new TreeSet<HashsetStudent>(b);
		HashsetStudent stu1=new HashsetStudent(10,"ramesh",90);
		HashsetStudent stu2=new HashsetStudent(20,"suresh",80);
		HashsetStudent stu3=new HashsetStudent(30,"rakesh",70);
		HashsetStudent stu4=new HashsetStudent(40,"naresh",60);
		HashsetStudent stu5=new HashsetStudent(50,"veeresh",100);
		t.add(stu5);
		t.add(stu4);
		t.add(stu3);
		t.add(stu2);
		t.add(stu1);
		System.out.println(t);
     
	}

}
