package com.tyss.collection;

import java.util.Iterator;

public class Arraycapacity1 implements Iterable {
	 int default_capacity=2;
		private	Object[] a=new Object[default_capacity];
		private int cur_index=0;
		private int size=0;
		
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
		
		
		Object get(int index){
			 return	a[index];
			}
		
		void remove(int index){
			System.arraycopy(a, index+1, a, index, a.length-index-1);
			size--;

		}
			
		int size(){
			return size;
		}

		@Override
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return new itr();
		}
		

class itr implements Iterator<Object>{
	
	private int index;
	
	@Override
	public boolean hasNext() {
		return (index<size)?true:false;
	}

	@Override
	public Object next() {
		Object o=a[index];
		index++;
		return o;
	}
	
}
}