package com.rana.dynamicProgramming;

import java.util.Arrays;

public class Rob {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
    static int[] memo;
    static int rob(int[] nums) {
        memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return robbing(nums, nums.length - 1);
    }
    static int robbing(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        if (memo[i] >= 0) {
            return memo[i];
        }
        int result = Math.max(robbing(nums, i - 2) + nums[i], robbing(nums, i - 1));
        memo[i] = result;
        return result;
    }
}
