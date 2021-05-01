package com.tyss.collection.set;

import java.util.Comparator;

public class ById implements Comparator<HashsetStudent>{

	@Override
	public int compare(HashsetStudent o1, HashsetStudent o2) {
		
		return o1.id-o2.id ;
	}

}
