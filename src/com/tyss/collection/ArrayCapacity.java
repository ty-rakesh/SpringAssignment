package com.tyss.collection;



public class ArrayCapacity {
    int default_capacity=2;
	private	Object[] a=new Object[default_capacity];
	private int cur_index=0;
	int size=0;
	
	void add(Object data){
		 ensureCapacity();
		 a[cur_index]=data;
			cur_index++;
			size++;
	}

	private void ensureCapacity() {
		if(cur_index>=a.length){
			grow(a,new Object[newCapacity()]);
		}
		
	}

	private int newCapacity() {
		return (a.length + (a.length>>1));
	}

	private void grow(Object[] oldArray, Object[] newArray) {
	 System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
	 a=newArray;
	}
	
	
	Object get(int i){
		 return	a[i];//a[i];
		}
	
	void remove(int index){
		System.arraycopy(a, index+1, a, index, a.length-index-1);
		size--;
	}
		
	int size(){
		return size;
	}

}
