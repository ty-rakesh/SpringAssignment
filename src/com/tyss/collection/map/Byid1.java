package com.tyss.collection.map;

import java.util.Comparator;

public class Byid1 implements Comparator<MapStudent> {

	@Override
	public int compare(MapStudent o1, MapStudent o2) {
		
		return o1.id-o2.id;
	}

}
