package com.rana.sorting;
//https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        int[] arr1 = {1,2,0};
        int[] arr2 = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr2));
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                return j + 1;
        }
        //System.out.println(Arrays.toString(nums));
        return nums.length + 1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
