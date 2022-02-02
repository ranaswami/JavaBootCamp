package com.rana.searchingAlgos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        selectionSort(nums);
    }
    static void selectionSort (int[] nums){
        for (int i = 0; i < nums.length; i++) {
            //find the max item in the remaining array and swap it with the correct index
            int lastIndex = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, lastIndex);
            swap(nums, maxIndex, lastIndex);
        }
        System.out.println(Arrays.toString(nums));
    }

    static int getMaxIndex(int[] nums, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (nums[max] < nums[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
