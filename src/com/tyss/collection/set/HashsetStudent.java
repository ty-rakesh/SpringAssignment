package com.tyss.collection.set;

public class HashsetStudent implements Comparable<HashsetStudent> {

	int id;
	String name;
	double percentage;
	public HashsetStudent(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
	
	
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	@Override
	public int compareTo(HashsetStudent o) {
		
		//return (int) (this.percentage-o.percentage) ;
     	return this.id-o.id;
	}
	@Override
	public int hashCode() {
		
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		HashsetStudent s=(HashsetStudent)obj;
		return this.id==this.id;
	}
}
