package com.rana.recursion;

import java.util.Arrays;
import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(Arrays.toString(stack.toArray()));
        System.out.println();
        reverseAStack(stack);
        System.out.println(Arrays.toString(stack.toArray()));

    }
    static void reverseAStack(Stack<Integer> stack){
        if (stack.size() == 1)
            return;

        int element = stack.peek();
        stack.pop();
        reverseAStack(stack);
        insert(stack, element);

    }
    static void insert(Stack<Integer> stack, int element){
        if (stack.isEmpty()){
            stack.push(element);
            return;
        }
        int temp = stack.peek();
        stack.pop();
        insert(stack, element);
        stack.push(temp);
    }
}
