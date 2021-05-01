package com.tyss.collection.map;
import java.util.*;
import java.util.Map.Entry;
public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> h=new Hashtable<>();
		
		h.put(8, "value");
		h.put(4, "java");
		h.put(1, "c++");
		h.put(3, "c");
		h.put(2, "JS");
		
		System.out.println(h);
		System.out.println(h.entrySet());
      Set<Entry<Integer, String>> entries=h.entrySet();
		
		for(Entry<Integer, String> Entry:entries){
			System.out.println(Entry.getKey());
			System.out.println(Entry.getValue());			
		}
	}
}
