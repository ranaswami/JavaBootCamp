package com.rana.sorting;
//https://leetcode.com/problems/sort-array-by-parity/
import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] nums1 = {0};

        System.out.println(Arrays.toString(sortArrayByParity(nums)));
        System.out.println(Arrays.toString(sortArrayByParity(nums1)));
    }
    static int[] sortArrayByParity(int[] nums) {//optimised approach
        int i = 0, j = 0;
        while (i < nums.length && j < nums.length){
            if ((nums[i] & 0x1) == 0){//to find whether a number is divisible by 2 or not using & operator
                swap(nums, i, j);
                j++;
            }
            i++;
        }
        return nums;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int[] sortArrayByParity1(int[] nums) {//brute force approach
        int[] arr = mergeSort(nums);
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0){
                continue;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    static int[] mergeSort(int[] nums){
        if (nums.length == 1)
            return nums;

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left,right);
    }
    static int[] merge(int[] left, int[] right){
        int[] res = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                res[k] = left[i];
                i++;
            } else {
                res[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length){
            res[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            res[k] = right[j];
            j++;
            k++;
        }
        return res;
    }
}
