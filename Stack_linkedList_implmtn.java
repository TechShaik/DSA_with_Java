package com.DSA;

public class Stack_linkedList_implmtn {

    class Node {
        int data;
        Node next;

        Node(int data) {  
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    Stack_linkedList_implmtn() {
        top = null;
    }

     public void push(int data) {
        Node n = new Node(data);  
        n.next = top;
        top = n;
    }

     public int pop() {
        if (top == null) {  
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        }
        int data =top.data;
         top = top.next;
		return data;  
     }

     public void disp() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Stack_linkedList_implmtn s = new Stack_linkedList_implmtn();
        s.push(10);
        s.push(20);
        s.disp();  
        System.out.println("Popped: " + s.pop()); 
        s.disp(); 
    }
}
