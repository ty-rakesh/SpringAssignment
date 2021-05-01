package com.tyss.collection;

import java.util.Iterator;

public class ArrayCapacityMain1 {

	public static void main(String[] args) {
		Arraycapacity1 ac1=new Arraycapacity1();
		System.out.println("size of an array: "+ac1.size());
		
        ac1.add(85);
        ac1.add(100);
        ac1.add(96);
        ac1.add("kali");
        ac1.add("haya");
        ac1.add(25);
        ac1.add("test");
        ac1.add("jai");
   
       
        
        System.out.println("size of an array: "+ac1.size());
//        for (int i = 0; i < ac1.size(); i++) {
//        	System.out.println(ac1.get(i));
//        }     
        System.out.println("using for-each");
        for (Object object : ac1) {
	             System.out.println(object);		
		}
        
        System.out.println("using iterator");
      Iterator itr= ac1.iterator();
      while(itr.hasNext()){
    	  System.out.println(itr.next());
      }
        System.out.println("after removing element: ");
        ac1.remove(2);
        for (int i = 0; i < ac1.size(); i++) {
        	System.out.println(ac1.get(i));
           	}
          	
        System.out.println("size of an array: "+ac1.size());
	}


	}


