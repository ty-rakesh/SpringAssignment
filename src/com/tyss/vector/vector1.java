package com.tyss.vector;

import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		Vector v=new Vector(2);
		v.add("java");
		v.add("python");
		System.out.println("capacity: "+v.capacity());
		v.add("c");
		v.add("c++");
		v.add(10);
		v.add(25);
		v.add(58);
		v.add(84);
		v.add(94);
		System.out.println("capacity: "+v.capacity());
		System.out.println(v);
		System.out.println(v.remove(1));
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
       	}
	
     // int pos=v.getPosition("c");
      //System.out.println(pos);
		
	}

}
