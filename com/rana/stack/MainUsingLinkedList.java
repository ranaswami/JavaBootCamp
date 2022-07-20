package com.rana.stack;

public class MainUsingLinkedList {
    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println(s.pop()+" popped from stack");
        System.out.println("Top element is: "+s.peek());
    }
}
