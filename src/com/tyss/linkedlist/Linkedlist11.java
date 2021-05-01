package com.tyss.linkedlist;


import java.util.Iterator;
import java.util.LinkedList;;
public class Linkedlist11 {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		
		l.add(10);
		l.addFirst(5);
		l.add(15);
		
		l.add(20);
		l.add(25);
		
		l.addLast(30);
		System.out.println(l);
	     l.add(5, 90);
	    System.out.println( l.contains(10));
		System.out.println(l.equals(10));
		System.out.println(l.isEmpty());
		System.out.println("using for-each ");
		for (Integer integer : l) {
			System.out.println(integer);
		}
		
		System.out.println("using for");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		Iterator it=l.iterator();
	}

}
