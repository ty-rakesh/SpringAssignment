package com.tyss.collection.map;

public class TStudents implements Comparable<TStudents> {

	int id;
	String name;
	double percentage;
	public TStudents(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public int compareTo(TStudents o) {
		
		return this.id-o.id;
	}
	
}
