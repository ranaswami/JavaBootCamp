package com.rana.sorting;
//https://leetcode.com/problems/largest-perimeter-triangle/
import java.util.Arrays;

public class LargestPerimeter {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        System.out.println(largestPerimeter(nums));
    }
    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for(int i = nums.length - 3; i >= 0; i--) {
            if(nums[i] + nums[i + 1] > nums[i + 2])
                return nums[i] + nums[i + 1] + nums[i + 2];
        }
        return 0;
    }
}
