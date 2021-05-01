package com.tyss.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraylistCopydemo {

	public static void main(String[] args) {
		//arraylist al=new arraylist();
		CopyOnWriteArrayList<Integer> cal=new CopyOnWriteArrayList<Integer>();
		
		cal.add(10);
		cal.add(20);
		cal.add(30);
		cal.add(40);
		cal.add(50);
		cal.add(60);
  
	  Iterator itr=	cal.iterator();
	  while(itr.hasNext()){
		
		  cal.add(70);
		  System.out.println(itr.next());
		  
		 // System.out.println(cal); 
	  }
	  System.out.println(cal);
	}

}
