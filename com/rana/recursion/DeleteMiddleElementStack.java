package com.rana.recursion;

import java.util.Arrays;
import java.util.Stack;

public class DeleteMiddleElementStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(Arrays.toString(stack.toArray()));
        System.out.println();
        System.out.println(Arrays.toString(deleteMiddleElementStack(stack).toArray()));
    }
    static Stack<Integer> deleteMiddleElementStack(Stack<Integer> stack){
        if (stack.size() == 0)
            return stack;
        int k = (stack.size() / 2) + 1;
        solve(stack, k);
        return stack;
    }
    static void solve(Stack<Integer> stack, int k){
        if (k == 1){
            stack.pop();
            return;
        }
        int temp = stack.peek();
        stack.pop();
        solve(stack, k - 1);
        stack.push(temp);
    }
}
