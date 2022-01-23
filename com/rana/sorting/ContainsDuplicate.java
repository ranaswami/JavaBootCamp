package com.rana.sorting;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
