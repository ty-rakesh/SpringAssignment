package com.tyss.collection.map;

public class MapStudent implements Comparable<MapStudent>{

	int id;
	String name;
	double marks;
	public MapStudent(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(MapStudent o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	@Override
	public String toString() {
		return "MapStudent [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapStudent other = (MapStudent) obj;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(marks) != Double.doubleToLongBits(other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
