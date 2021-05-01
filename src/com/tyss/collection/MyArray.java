package com.tyss.collection;

public class MyArray {
	int[] a=new int[10];
	int cur_index=0;
	int size=0;
	
	void add(int index){
		a[cur_index]=cur_index+0;
		cur_index++;
		size++;
	}
	int get(int index){
		return a[index];
	}

	void remove(int index){
	a[index]=-1;
	    size--;
	}
	int size(){
		return size;
	}

}
