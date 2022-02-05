package com.rana.sorting;

import java.util.Arrays;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(maximumProduct(nums));
    }
    static int maximumProduct(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                nums[i] *= -1;
            }
        }
        Arrays.sort(nums);
        int res = (nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
        return res;
    }
}
