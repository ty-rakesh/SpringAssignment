package com.tyss.collection;

public class ArrayCapacityMain {

	public static void main(String[] args) {
		ArrayCapacity ac=new ArrayCapacity();
		System.out.println("size of an array: "+ac.size);
		
        ac.add(85);
        ac.add(100);
        ac.add(96);
        ac.add("kali");
        ac.add("haya");
        ac.add(25);
        ac.add("test");
        ac.add("jai");
   
       
        
        System.out.println("size of an array: "+ac.size());
        for (int i = 0; i < ac.size(); i++) {
        	System.out.println(ac.get(i));
        }     

        ac.remove(2);
        for (int i = 0; i < ac.size; i++) {
        	System.out.println(ac.get(i));
           	}
          	
        System.out.println("size of an array: "+ac.size);
	}

	}


