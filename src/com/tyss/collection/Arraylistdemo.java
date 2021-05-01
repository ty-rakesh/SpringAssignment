package com.tyss.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(5,60);
		al.set(5,70);
		
		
		System.out.println(al);
		
		al.remove(5);
		System.out.println(al);
 
		System.out.println("using for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("using for-each");
		for (Integer integer : al) {
			System.out.println(integer);
			
		}
		
		
		System.out.println("using iterator");
		Iterator it=al.iterator() ;{
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
		
		System.out.println("using listIterator");
		ListIterator it1=al.listIterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}

		System.out.println("using listIterator of previous method");
		ListIterator it2=al.listIterator(al.size());
		while(it2.hasPrevious()){
			System.out.println(it2.previous());
		}
		
		
		
	}
}
