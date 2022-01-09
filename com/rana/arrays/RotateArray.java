package com.rana.arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(moveByOne(nums,3)));
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
    static int[] moveByOne(int[] nums,int k){

        for (int i = 1; i <= k; i++) {
            int temp = nums[nums.length - 1];

            for (int index = nums.length - 2; index >=0 ; index--) {
                nums[index + 1] = nums[index];
            }
            nums[0] = temp;
        }
        return nums;
    }
}
