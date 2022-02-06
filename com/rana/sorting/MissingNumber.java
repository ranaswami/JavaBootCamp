package com.rana.sorting;
//https://leetcode.com/problems/missing-number/
public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j)
                return j;
        }
        //System.out.println(Arrays.toString(nums));
        return nums.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
