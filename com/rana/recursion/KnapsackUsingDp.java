package com.rana.recursion;
//KnapsackUsingDp. Concept of memoization is used here to solve Knapsack problem.
public class KnapsackUsingDp {
    public static void main(String[] args) {

        int wt[] = {1,3,4,5};
        int val[] = {1,4,5,7};
        int capacity = 7;
        int n = wt.length;

        System.out.println(knapSack(capacity, wt, val, n));

    }
    static int knapSack(int W, int wt[], int val[], int n){
        int t[][] = new int[n+1][W+1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W +1; j++) {
                t[i][j] = -1;
            }
        }

        return knapSackRec(W, wt, val, n, t);
    }

    static int knapSackRec(int W, int wt[], int val[], int n, int t[][]) {
        if (n == 0 || W == 0)
            return 0;
        if (t[n][W] != -1)
            return t[n][W];
        if (wt[n-1] <= W){
            return t[n][W] = Math.max(val[n-1] + knapSackRec(W - wt[n-1], wt, val, n-1, t), knapSackRec(W, wt, val, n - 1, t));
        }
        else {
            return t[n][W] = knapSackRec(W, wt, val, n - 1, t);
        }
    }
}
