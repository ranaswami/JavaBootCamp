package com.rana.recursion;
//KnapsackUsingDp. Concept of Top down approach is used here to solve Knapsack problem.
public class KnapsackUsingTopDown {
    public static void main(String[] args) {

        int wt[] = {1,3,4,5};
        int val[] = {1,4,5,7};
        int capacity = 7;
        int n = wt.length;

        System.out.println(knapSack(capacity, wt, val, n));

    }
    static int knapSack(int W, int wt[], int val[], int n){
        int[][] t = new int[n+1][W+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < W+1; j++) {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {
                if (wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1] + t[i-1][j - wt[i-1]], t[i-1][j]);
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][W];
    }
}
