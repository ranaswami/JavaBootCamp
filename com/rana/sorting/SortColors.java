package com.rana.sorting;
//https://leetcode.com/problems/sort-colors/
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
    static void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0)
                count0++;
            else if (nums[i] == 1)
                count1++;
            else
                count2++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < count0){
                nums[i] = 0;
            }
            else if (i >= count0 && i < count0 + count1)
                nums[i] = 1;
            else if (i >= count0 + count1 && i < nums.length)
                nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
