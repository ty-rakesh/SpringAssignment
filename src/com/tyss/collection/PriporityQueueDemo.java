package com.tyss.collection;

import java.util.PriorityQueue;

public class PriporityQueueDemo {

	public static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        pq.add(15);
       // pq.add("jk");
        pq.add(94);
        pq.add(14);
        
        System.out.println(pq);
        
        System.out.println(pq.peek());

        System.out.println( pq.poll());
        
        System.out.println(pq);
	}

}
