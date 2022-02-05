package com.rana.searchingAlgos;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        insertionSort(nums);
    }
    static void insertionSort(int[] nums){
        /**
         * Basically, we are inserting an element at a time to its left sorted subarray.
         * for every index, put that index element to the correct index of LHS
         * With every pass LHS of the array becomes a sorted sub array
         */
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] < nums[j-1]){
                    swap(nums, j,j-1);
                }else
                    break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
