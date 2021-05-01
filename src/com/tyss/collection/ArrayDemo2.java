package com.tyss.collection;

public class ArrayDemo2 {

	public static void main(String[] args) {
		MyArray arr=new MyArray();
		System.out.println("size of an array: "+arr.size);
		
		for (int i = 0; i < 10; i++) {
			arr.add(i+0);
			System.out.println(arr.get(i));
			
		}
		arr.remove(2);
		for (int i = 0; i < 10; i++) {
			System.out.println(arr.get(i));
			
		}
		System.out.println("size of an arr: "+arr.size());
	}	

}
