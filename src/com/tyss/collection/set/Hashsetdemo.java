package com.tyss.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Hashsetdemo {

	public static void main(String[] args) {
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		h.add(10);
		h.add(10);
		h.add(20);
		h.add(95);
		//h.add(null);
		
		
		System.out.println(h);
		
		ArrayList<Integer> al=new ArrayList<Integer>(h);
	    Collections.sort(al);
		System.out.println(al);
		

	}

}
