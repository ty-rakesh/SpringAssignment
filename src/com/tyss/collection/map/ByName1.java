package com.tyss.collection.map;

import java.util.Comparator;

public class ByName1 implements Comparator<MapStudent> {

	@Override
	public int compare(MapStudent o1, MapStudent o2) {
////		String s1=o1.name;
////		String s2=o2.name;
//		return s1.compareTo(s2);
		return o1.name.compareTo(o2.name);
	}

	

}
