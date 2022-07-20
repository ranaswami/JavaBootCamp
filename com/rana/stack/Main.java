package com.rana.stack;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " popped from stack");
        System.out.println("Top element is: "+s.peek());
        System.out.print("Elements in the stack are:");
        s.print();
    }
}
