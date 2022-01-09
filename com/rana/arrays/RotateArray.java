package com.rana.arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};

        System.out.println(Arrays.toString(rotateArray1(nums,2)));
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
    static int[] rotateArray1(int[] nums,int k){
        k %= nums.length;
        for (int i = nums.length - k,j = 0; i < nums.length; i++,j++) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }

        int temp = nums[k];
        for (int index = k; index <=nums.length - 2; index++) {
            nums[index] = nums[index+1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }
}
