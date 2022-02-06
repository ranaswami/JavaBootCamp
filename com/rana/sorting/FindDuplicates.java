package com.rana.sorting;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDuplicates(arr);
        System.out.println(Arrays.toString(list.toArray()));
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }
        List<Integer> li = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1)
                li.add(nums[index]);
        }
        return li;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
