package com.tyss.Stack;

import java.util.Stack;

public class Stack1 {
 
    public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.push(80);
		s.push(90);
		s.push(100);
		s.pop();
		System.out.println("capacity of stack: "+s.capacity());
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.firstElement());
		System.out.println(s.peek());
		System.out.println(s.firstElement());
		System.out.println(s.remove(1));
		System.out.println( s);
	}	
}
