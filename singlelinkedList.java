package com.JavaCodingFromScratch;

public class singlelinkedList {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	  Node head=null;
	  Node tail=null;
	
	public void addAtEnd(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			tail=n;
			
		}
	}
	
	public void addAtBeg(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}else {
			n.next=head;
			head=n;
		}
	
	
	}
	
	public void delAtEnd() {
		if(head==null) {
			System.out.println("Empty");
		}else {
			
		}
	}

	 public void addAtPoint(int pos,int data) {
		Node n=new Node(data);
		  Node temp = head;
	        for (int i = 1; i < pos - 1 && temp != null; i++) {
	            temp = temp.next;
	        }
	        
	        if (temp == null) {
	            System.out.println("Position is out of bounds");
	            return;
	        }
	        
	        n.next = temp.next;
	        temp.next = n;
	        
	        if (n.next == null) {
	            tail = n;
	        }
	    
	 }
	
	public void  disp() {
		Node curr=head;
		if(head==null) {
			System.out.println("List is empty");
		}else {
			while(curr!=null) {
				System.out.println(curr.data);
				curr=curr.next;
			}
		}
	}

	public static void main(String[] args) {
		singlelinkedList l=new singlelinkedList();
		 l.addAtEnd(10);
		 l.addAtEnd(20);
		 l.addAtEnd(30);
		 l.addAtBeg(20);
		 l.addAtPoint(2, 50);
		 l.disp();
	}

}
