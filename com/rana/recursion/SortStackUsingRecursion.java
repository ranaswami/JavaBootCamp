package com.rana.recursion;

import java.util.Arrays;
import java.util.Stack;

public class SortStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(0);
        stack.push(2);

        System.out.println(Arrays.toString(stack.toArray()));
        System.out.println();
        sortStackUsingRecursion(stack);
        System.out.println(Arrays.toString(stack.toArray()));

    }
    static void sortStackUsingRecursion(Stack<Integer> stack){
        if (stack.size() == 1)
            return;
        int temp = stack.peek();
        stack.pop();
        sortStackUsingRecursion(stack);
        insert(stack,temp);
    }
    static void insert(Stack<Integer> stack, int temp){
        if (stack.isEmpty() || stack.peek() <= temp){
            stack.push(temp);
            return;
        }
        int val = stack.peek();
        stack.pop();
        insert(stack,temp);
        stack.push(val);
    }
}
