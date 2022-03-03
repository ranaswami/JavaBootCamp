package com.rana.recursion;

public class Knapsack {
    public static void main(String[] args) {
        int wt[] = {1,3,4,5};
        int val[] = {1,4,5,7};
        int capacity = 7;
        int n = wt.length;

        System.out.println(knapsack(wt, val, capacity, n));

    }
    static int knapsack(int wt[], int val[], int capacity, int n){
        if (n == 0 || capacity == 0)
            return 0;

        if (wt[n-1] <= capacity){
            return Math.max(val[n-1] + knapsack(wt, val, capacity - wt[n-1], n -1), knapsack(wt, val, capacity, n - 1));
        }
        else {
            return knapsack(wt, val, capacity, n - 1);
        }
    }
}
