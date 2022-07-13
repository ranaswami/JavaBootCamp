package com.rana.stack;
//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1/#
import java.util.Arrays;
import java.util.Stack;

public class NextLargerElement {
    public static void main(String[] args) {
        long[] arr = {1,3,2,4};
        int n = 4;
        System.out.println(Arrays.toString(nextLargerElement(arr, n)));

    }
    static long[] nextLargerElement(long[] arr, int n) {
        long[] res = new long[n];
        Stack<Long> s = new Stack<>();

        for (int i = n-1; i >= 0 ; i--) {
            if (s.size() == 0){
                res[i] = -1;
            }
            else if(s.size() > 0 && s.peek() > arr[i]){
                res[i] = s.peek();
            }
            else if(s.size() > 0 && s.peek() <= arr[i]){
                while (s.size() > 0 && s.peek() <= arr[i]){
                    s.pop();
                }
                if (s.size() == 0){
                    res[i] = -1;
                }
                else {
                    res[i] = s.peek();
                }
            }
            s.push(arr[i]);
        }
        return res;
    }
}
