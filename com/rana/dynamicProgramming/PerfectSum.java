package com.rana.dynamicProgramming;
//https://practice.geeksforgeeks.org/problems/perfect-sum-problem5633/1
//This question is also similar to 0/1 Knapsack.
public class PerfectSum {
    public static void main(String[] args) {
        int N = 6;
        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 10;

        System.out.println(perfectSum(arr, N, sum));

    }
    static int perfectSum(int arr[],int n, int sum) {
        // Your code goes here
        int[][] t = new int[n+1][sum+1];

        for (int i = 0; i < t.length; i++) {
            t[i][0] = 1;
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (arr[i-1] <= j){
                    t[i][j] = (t[i-1][j] % ((int) Math.pow(10,9)+7) + t[i-1][j-arr[i-1]] % ((int) Math.pow(10,9)+7)) % ((int) Math.pow(10,9)+7);
                }
                else {
                    t[i][j] = t[i-1][j] % ((int) Math.pow(10,9)+7);
                }
            }
        }

        return t[n][sum] % ((int) Math.pow(10,9)+7);
    }
}
