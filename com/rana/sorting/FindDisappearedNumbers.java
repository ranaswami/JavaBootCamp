package com.rana.sorting;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(list.toArray()));

    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li = new ArrayList<>();

        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j){
                li.add(j+1);
            }
        }

        return li;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
