package com.rana.sorting;
//https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;

public class FindErrorNums {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else
                i++;
        }
        int j = 0;
        while (j < nums.length){
            if (nums[j] - 1 != j){
                return new int[] {nums[j], j+1};
            }
            j++;
        }
        return new int[]{};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
