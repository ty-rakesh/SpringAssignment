package com.tyss.collection;

public class MyArray1 {

	 Object[] a=new Object[10];
	 int cur_index=0;
	 int size=0;
	
	void add(Object index){
		a[cur_index]=index;
		cur_index++;
		size++;
	}
	
	Object get(int index){
	 return	a[index];
	}
	
	void remove(int index){
		a[index]=null;
		size--;
	}
	int size(){
		return size;
	}
}
