package com.rana.searchingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        bubbleSort(nums);//comparison sort method
    }
    static void bubbleSort(int[] nums){
        boolean swap;
        //run the steps n-1 times
        for (int i = 0; i < nums.length; i++) {
            swap = false;
            //the max element will be at its right position after 1st pass, so we can ignore the last index of the sorted array
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] > nums[j]){
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    swap = true;
                }
            }
            //if you didn't swap for a paricular value it means that the array is sorted. Stop the program
            if (!swap){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
