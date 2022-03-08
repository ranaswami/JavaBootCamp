package com.rana.dynamicProgramming;
//https://practice.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1/#
public class UnboundedKnapSack {
    public static void main(String[] args) {
        int N = 2, W = 3;
        int val[] = {1, 1};
        int wt[] = {2, 1};

        System.out.println(knapSack(N, W, val, wt));

    }
    static int knapSack(int N, int W, int val[], int wt[]) {
        int[][] t = new int[N+1][W+1];

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[0].length; j++) {
                if (wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1] + t[i][j - wt[i-1]], t[i-1][j]);
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[N][W];
    }
}
