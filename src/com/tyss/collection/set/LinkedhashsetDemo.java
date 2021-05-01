package com.tyss.collection.set;

import java.util.LinkedHashSet;

public class LinkedhashsetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		
		lh.add(5);
		lh.add(10);
		lh.add(5);
		lh.add(20);
		lh.add(15);
		lh.add(35);
		lh.add(90);
		lh.add(5);
		
        System.out.println(lh);
        
      
        System.out.println(lh.size());
	}

}
