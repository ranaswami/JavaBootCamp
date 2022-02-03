package com.rana.sorting;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> res = threeSum(nums);


    }
    static List<List<Integer>> threeSum0(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0){
                        set.add(i);
                        set.add(j);
                        set.add(k);
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>();

        return list;
    }
    static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        return list;
    }
    static int[] mergeSort(int[] nums){
        if (nums.length == 1)
            return nums;

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
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
