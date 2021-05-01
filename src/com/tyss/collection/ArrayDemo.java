package com.tyss.collection;

class Arrray{
	int[] arr=new int[10];
	int cur_index=0;
	int size;
	 
	void add(int i){
		arr[cur_index]=cur_index+i;
		cur_index++;
	}
	
	int get(int i){
		return arr[i];
	}
	void remove(int index){
		arr[index]=-2;
		size--;
	}
     int size(){
    	 return cur_index; 
    }
}
public class ArrayDemo {

	public static void main(String[] args) {

		Arrray a=new Arrray();
		System.out.println("array size: "+a.size());
		for (int i = 0; i < 5; i++) {
			a.add(0+i);	
			System.out.println(a.get(i));
		}
		System.out.println("array size: "+a.size);

		System.out.println("removing element:");
		a.remove(1);
		
		System.out.println("array size: "+ a.size());
	}

}
