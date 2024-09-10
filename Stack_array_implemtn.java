package com.DSA;

public class Stack_array_implemtn {
    int size;
    int[] arr; 
    int top;

    Stack_array_implemtn() {
        this.size = 10;
        this.arr = new int[size];
        this.top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + data);
        } else {
            arr[++top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Indicating stack is empty
        } else {
            return arr[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Indicating stack is empty
        } else {
            return arr[top];
        }
    }

    public void disp() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack_array_implemtn s = new Stack_array_implemtn();
        s.push(10);
        s.push(20);
        s.push(50);
        s.disp();
        System.out.println("Popped: " + s.pop()); // Popping an element
        s.disp();
         System.out.println("Peek: " + s.peek()); // Peeking at the top element
    }
}
