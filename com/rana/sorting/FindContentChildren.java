package com.rana.sorting;
//https://leetcode.com/problems/assign-cookies/
import java.util.Arrays;

public class FindContentChildren {

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g,s));
    }
    static int findContentChildren(int[] g, int[] s) {
        int[] first = mergeSort(g);
        int[] second = mergeSort(s);
        int i = 0;
        for(int j=0;i<first.length && j<second.length;j++) {
            if(first[i]<=second[j]) i++;
        }
        return i;
    }
    static int[] mergeSort(int[] nums){
        if (nums.length < 1)
            return new int[] {-1};
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
