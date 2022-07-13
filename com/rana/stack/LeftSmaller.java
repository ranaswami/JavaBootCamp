package com.rana.stack;
//https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1/#
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LeftSmaller {
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 3, 4, 5};
        int n = 6;
        System.out.println(Arrays.toString(leftSmaller(n, arr).toArray()));

    }
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (s.size() == 0){
                list.add(-1);
            }
            else if (s.size() > 0 && s.peek() < a[i]){
                list.add(s.peek());
            }
            else if (s.size() > 0 && s.peek() >= a[i]){
                while (s.size() > 0 && s.peek() >= a[i]){
                    s.pop();
                }
                if (s.size() == 0){
                    list.add(-1);
                }
                else {
                    list.add(s.peek());
                }
            }
            s.push(a[i]);
        }
        return list;
    }
}
