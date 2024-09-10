package com.JavaCodingFromScratch;

public class CLL {
    
    public class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head = null;
    Node tail = null;
    
    public void addAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
            tail.next = head;  // Point back to head, making it circular
        } else {
            tail.next=n;
            tail=n;
            tail.next=head;// Maintain the circular structure
        }
    }
    
    public void addAtBeg(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
            tail.next = head;  // Point back to head, making it circular
        } else {
            n.next = head;
            head = n;
            tail.next = head;  // Maintain the circular structure
        }
    }
    
    public void delAtEnd() {
    	 if(head==tail) {
      	   System.out.println("Empty");
         }else {
        	 Node temp=head;
        	 while(temp.next!=tail) {
        		 temp=temp.next;
        	 }
        	 tail=temp;
        	 tail.next=head;
         }
    }
    
    public void delAtFront() {
       if(head==tail) {
    	   System.out.println("Empty");
       }else {
    	   head=head.next;
    	   tail.next=head;
       }
    }
    
    public void disp() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != head);  // Stop when we loop back to the head
    }

    public static void main(String[] args) {
        CLL c = new CLL();
        c.addAtBeg(20);
        c.addAtBeg(200);
         c.addAtEnd(50);
        c.addAtEnd(100);   
        c.disp();
        System.out.println();
        c.delAtFront(); 
        c.disp();
        c.delAtFront();
        System.out.println();
        c.disp();
    }
}
