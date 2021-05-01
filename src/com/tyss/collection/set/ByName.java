package com.tyss.collection.set;

import java.util.Comparator;

public class ByName implements Comparator<HashsetStudent> {

	@Override
	public int compare(HashsetStudent o1, HashsetStudent o2) {
		String s1=o1.name;
		String s2=o2.name;
		return s1.compareTo(s2);
	}

}
