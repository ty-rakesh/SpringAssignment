package com.tyss.collection.set;

import java.util.Comparator;

public class ByPercentage implements Comparator<HashsetStudent>{


//	@Override
//	public int compare(Student o1, Student o2) {
//		
//		return (int) (o1.percentage-o2.percentage);
//	}

	@Override
	public int compare(HashsetStudent o1, HashsetStudent o2) {
		
		return (int) (o1.percentage-o2.percentage);
	}

}
