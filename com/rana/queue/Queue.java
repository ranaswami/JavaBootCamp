package com.rana.queue;

import java.util.Stack;

public class Queue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
        // Your code here
        if (stack1.peek() == null){
            return Integer.MIN_VALUE;
        }
        else{
            int x = stack1.peek();
            stack1.pop();
            return x;
        }
    }

    /* The method push to push element into the stack */
    void enqueue(int x)
    {
        // Your code here
        while (stack1.isEmpty() == false){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (stack2.isEmpty() == false){
            stack1.push(stack2.pop());
        }
    }
}
