package com.rana.sorting;

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        //no need to sort the array. Use two pointer method to solve the question
        int i = 0, j = 1;//i is for even position and j is for odd position
        while (i < nums.length && j < nums.length){
            while (i < nums.length && nums[i] % 2 == 0){
                i = i + 2;
            }
            while (j < nums.length && nums[j] % 2 == 1){
                j = j + 2;
            }
            if (i < nums.length && j < nums.length){
                swap(nums, i, j);
            }
        }
        return nums;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
