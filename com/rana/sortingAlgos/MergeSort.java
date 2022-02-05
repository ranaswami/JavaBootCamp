package com.rana.sortingAlgos;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4};
        a = mergeSort(a);
        //mergeSortInPlace(a,0, a.length);
        System.out.println(Arrays.toString(a));
    }
    static int[] mergeSort(int[] nums){
        if (nums.length == 1){
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
        
        return merge(left,right);
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

        /**
        while (k < res.length){
            if (left[i] < right[j] && i < left.length){
                res[k] = left[i];
                i++;
                k++;
            } else if (left[i] > right[j] && j < right.length){
                res[k] = right[j];
                j++;
                k++;
            }
         }
         */

        return res;
    }

    static void mergeSortInPlace(int[] nums, int start, int end){
        if (end - start == 1){
            return;
        }
        int mid = (start + end) / 2;

        mergeSortInPlace(nums, start, mid);
        mergeSortInPlace(nums, mid, end);

        mergeInPlace(nums, start, mid, end);

    }

    static void mergeInPlace(int[] nums, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start, j = mid, k = 0;

        while (i < mid && j < end){
            if (nums[i] < nums[j]){
                mix[k] = nums[i];
                i++;
            } else {
                mix[k] = nums[j];
                j++;
            }
            k++;
        }
        while (i < mid){
            mix[k] = nums[i];
            i++;
            k++;
        }
        while (j < end){
            mix[k] = nums[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            nums[start + l] = mix[l];
        }
    }

}
