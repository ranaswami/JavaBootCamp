package com.rana.recursion;
//https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1/
//subset sum problem
public class SubsetSum {
    public static void main(String[] args) {

        int n = 6;
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;

        System.out.println(isSubsetSum(n, arr, sum));

    }
    static boolean isSubsetSum(int n, int[] arr, int sum){
        boolean[][] t = new boolean[arr.length+1][sum+1];

        for (int i = 0; i < t.length; i++) {
            t[i][0] = true;
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (arr[i-1] <= j){
                    t[i][j] = t[i-1][j - arr[i-1]] || t[i-1][j];
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        return t[arr.length][sum];
    }
}
