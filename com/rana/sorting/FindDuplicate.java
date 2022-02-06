package com.rana.sorting;
//https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));

    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }
        int index = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                index = nums[j];
        }
        return index;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
