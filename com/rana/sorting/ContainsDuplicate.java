package com.rana.sorting;

import java.util.Arrays;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public static void main(String[] args) {


    }
    static boolean containsDuplicate1(int[] nums) {

        boolean rs = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    rs = true;
                    break;
                }

            }
        }
        return rs;
    }
    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
}
