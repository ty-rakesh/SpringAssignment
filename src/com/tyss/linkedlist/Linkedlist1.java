package com.tyss.linkedlist;

public class Linkedlist1 {
	Node head;
	public void insert(int data){
		Node nod=new Node(data);
		nod.data=data;
		nod.next=null;
		if(head==null){
			head=nod;
		}else{
			Node n=head;
			while(n.next!=null){
				n=n.next;
			}
			n.next=nod;
		}
	}

	public void insertfirst(int data){
		Node nod=new Node(data);
		nod.data=data;
		nod.next=null;
		nod.next=head;
		head=nod;
	}
	
	public void middle(int data,int index){
		Node nod=new Node(data);
		nod.data=data;
		nod.next=null;
		nod.next=head;
//		for(int i=0;i<index-1;i++){
//			n=S
//		}
	}
    
	public void delete(int index){
		if(index==0){
			head=head.next;
		}else{
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++){
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("n1 deleted: "+n1.data);
		}
	}
	
	public void show(){
		Node nod=head;
		while(nod.next!=null){
			System.out.println(nod.data);
			nod=nod.next;
		}
		System.out.println(nod.data);
	}
}

