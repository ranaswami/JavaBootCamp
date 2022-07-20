package com.rana.stack;

public class Stack {
    static final int max = 1000;
    int top;
    int[] arr = new int[max];

    boolean isEmpty(){
        return (top < 0);
    }
    Stack(){
        top = -1;
    }
    void push(int x){
        if (top >= (arr.length-1)){
            System.out.println("Stack overflow");
        }
        else {
            top++;
            arr[top] = x;
        }
    }
    int pop(){
        if (top < 0){
            System.out.println("Stack Underflow");
            return -1;
        }
        else {
            int x = arr[top];
            top--;
            return x;
        }
    }
    int peek(){
        if (top < 0){
            System.out.println("Stack Underflow");
            return -1;
        }
        else {
            return arr[top];
        }
    }
    void print(){
        for (int i = top; i > -1; i--) {
            System.out.print(" "+arr[i]);
        }
    }
}
