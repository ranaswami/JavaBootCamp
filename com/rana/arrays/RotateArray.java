package com.rana.arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(Arrays.toString(moveByOne(nums)));
    }
    static void rotateArray(int[] nums, int k) {
        int[] res = new int[nums.length];

        for (int i = 0, j = nums.length - 1; i < k; i++,j++) {
            res[i] = nums[j];
        }

        for (int i = k, j = 0; i < res.length; i++,j++) {
            res[i] = nums[j];
        }
    }
    static int[] moveByOne(int[] nums){
        
        int temp;

        for (int i = 1; i < nums.length; i++) {
            temp = nums[i];
            nums[i] = nums[i - 1];
        }
        return nums;
    }
}
