package com.tyss.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap <Integer,String> m=new HashMap<Integer,String>();
	//	TreeMap<MapStudent, String> tm=new TreeMap<MapStudent,String>();
		m.put(1, "home");
		m.put(2, "tata");
		m.put(4, "test");
		m.put(3, "yantra");
		
		System.out.println(m);
//		System.out.println(((Entry<Integer, String>) m).getKey());
//		System.out.println(((Entry<Integer, String>) m).getValue());
		System.out.println(m.containsKey(1));
       
//		System.out.println(m.keySet());
//		System.out.println(m.entrySet());
		
		Set<Entry<Integer, String>> set=m.entrySet();
		
		System.out.println(set);
		
//		Set<Entry<Integer, String>> entries=m.entrySet();
//		
//		for(Entry<Integer, String> Entry:entries){
//			System.out.println(Entry.getKey());
//			System.out.println(Entry.getValue());
//			
		for(Map.Entry I1 : m.entrySet()){
			System.out.println(I1.getValue());
			
		}
		
	}

}
