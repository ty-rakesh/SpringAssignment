package com.tyss.collection;

public class ArrayDemo3 {

	public static void main(String[] args) {
		MyArray1 ma=new MyArray1();
		
        ma.add(85);
        ma.add("hsdg");
        ma.add(96);
        ma.add("jabba");
        ma.add("hfgdi");
        System.out.println("size of an array: "+ma.size());
        for (int i = 0; i < 5; i++) {
        	System.out.println(ma.get(i));
			
		}
         
        ma.remove(2);
        ma.remove(3);
        for (int i = 0; i < 5; i++) {
        	System.out.println(ma.get(i));
			
		}
          
        System.out.println("size of an array: "+ma.size);
	}

}
