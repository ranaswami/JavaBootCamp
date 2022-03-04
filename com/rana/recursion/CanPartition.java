package com.rana.recursion;
//https://leetcode.com/problems/partition-equal-subset-sum/
//Equal sum partition Problem
public class CanPartition {
    public static void main(String[] args) {
        int[] arr = {1,5,11,5};
    }
    static boolean canPartition(int[] nums) {
        if (nums.length <= 1)
            return false;

        int arrsum = 0;
        for (int i = 0; i < nums.length; i++) {
            arrsum += nums[i];
        }

        if (arrsum % 2 == 1)
            return false;

        return isSubsetSum(nums, arrsum/2);
    }

     static boolean isSubsetSum(int[] arr, int sum) {//
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
