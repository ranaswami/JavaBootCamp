package com.rana.recursion;
//https://leetcode.com/problems/target-sum/
//Count the number of subset with a given difference
public class FindTargetSumWays {
    public static void main(String[] args) {

        int[] arr = {0,0,0,0,0,0,0,0,1};
        int target = 1;

        int[] arr1 = {1000};
        int target1 = -1000;

        System.out.println(findTargetSumWays(arr1, target1));
    }
    static int findTargetSumWays(int[] nums, int target) {
        /**
        target = Math.abs(target);
        if (nums.length == 1 && target > nums[0])
            return 0;
        if (nums.length == 1 && Math.abs(target) == (nums[0]))
            return 1;

        if (nums.length == 1 && target < nums[0])
            return 0;

         Solved this problem using Knapsack method.
         */

        if (nums.length == 1 && Math.abs(target) == (nums[0]))
            return 1;
        int arrsum = 0;
        for (int i = 0; i < nums.length; i++) {
            arrsum += nums[i];
        }

        if (Math.abs(target) > arrsum)
            return 0;

        if ((target + arrsum) % 2 == 1){
            return 0;
        }

        int sum = (target + arrsum) / 2;
        Math.abs(sum);
        return countOfSubsetSum(nums, sum);
    }

    static int countOfSubsetSum(int[] nums, int sum) {
        int[][] t = new int[nums.length+1][sum+1];

        t[0][0] = 1;
        for (int i = 1; i < t.length; i++) {
            t[i][0] = 1;
        }
        for (int i = 1; i < t[0].length; i++) {
            t[0][i] = 0;
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (nums[i-1] <= j){
                    t[i][j] = t[i-1][j] + t[i-1][j - nums[i-1]];
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[nums.length][sum];
    }
}
