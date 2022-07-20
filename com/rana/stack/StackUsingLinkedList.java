package com.rana.stack;

public class StackUsingLinkedList {

    StackNode root;

    static class StackNode{
        int data;
        StackNode next;

        StackNode(int data){ //constructor
            this.data = data;
        }
    }

    public boolean isEmpty(){
        if (root == null){
            return true;
        }
        else return false;
    }
    public int peek(){
        if (root == null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else return root.data;
    }
    public int pop(){
        int popped_value = Integer.MIN_VALUE;
        if (root == null){
            System.out.println("Stack is empty");
        }
        else {
            popped_value = root.data;
            root = root.next;
        }
        return popped_value;
    }
    public void push(int x){
        StackNode newNode = new StackNode(x);
        if (root == null){
            root = newNode;
        }
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
    }
}
