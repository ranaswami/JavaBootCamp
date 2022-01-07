package com.rana.arrays;
//https://leetcode.com/problems/maximum-subarray/

public class MaxSubArray {
    public static void main(String[] args) {
        //System.out.println("hey");

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        //O/P: 6
        System.out.println(kadanesAlgo(nums));

    }
    static int maxSubArray(int[] nums) {
        //time complexity is O(n^2)
        if (nums.length == 1)
            return 1;

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i;j < nums.length;j++) {
                sum += nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    static int kadanesAlgo(int[] nums){
        //time complexity is O(n)

        int maxSum = Integer.MIN_VALUE;
        //System.out.println(maxSum + nums[0]);
        int currSum = 0;

        for (int i = 0;i < nums.length;i++){
            currSum += nums[i];
            if (currSum > maxSum)
                maxSum = currSum;
            if (currSum < 0)
                currSum =0;
        }
        return maxSum;
    }
}
