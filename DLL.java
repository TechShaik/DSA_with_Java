package com.JavaCodingFromScratch;

public class DLL {
	 
	class Node{	
	
	int data;
	Node prev;
	Node next;
	 
	 
	public Node(int data) {
		this.data=data;
		
	}
	}
	Node head=null;
	Node tail=null;
	
	public void addAtBeg(int data) {
		Node n=new Node(data);
		n.next=head;
		head=n;
		head.prev=null;
		tail.next=null;
	}
 
	public void  addAtEnd(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=tail=n;
			head.prev=tail.next=null;
			 
			}else {
			tail.next=n;
			n.prev=tail;
			tail=n;
			tail.next=null;
			}
	}
	
	public void delAtEnd(){
		Node temp=head;

	
		if(head==tail) {
			head=tail=null; 
		}
 		
		else {
			tail=tail.prev;
			tail.next=null;
		}
	}
	
	
	public void delAtBeg() {
		head=head.next;
		tail.next=null;
	}
	public void disp() {
		Node curr=head;
		if(head==null) {
			System.out.println("Empty");
		}else {
			while(curr!=null) {
				System.out.println(curr.data);
				curr=curr.next;
			}
		}
	}
	 
	
 		
	

	public static void main(String[] args) {
		 DLL d=new DLL();
		 d.addAtEnd(20);
		 d.addAtEnd(30);
		 d.addAtEnd(10);
		 d.disp();
		 System.out.println();
		 d.addAtBeg(50);
		 d.disp();
		 d.delAtEnd();
		 System.out.println();
		 d.disp();
		 d.delAtBeg();
		 System.out.println();
		 d.disp();
		 }
	

}
