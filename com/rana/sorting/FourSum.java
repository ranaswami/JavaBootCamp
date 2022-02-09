package com.rana.sorting;
//https://leetcode.com/problems/4sum/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int[] nums1 = {-2,-1,-1,1,1,2,2};
        int target = 0;
        List<List<Integer>> res = fourSum(nums1, target);
        System.out.println(Arrays.toString(res.toArray()));
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums.length == 0)
            return res;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {//because our a can go to 3rd last element in the array
            for (int j = i+1; j < nums.length; j++) {
                int low = j + 1, high = nums.length - 1, modTareget = target - (nums[i] + nums[j]);
                while (low < high) {
                    if (nums[low] + nums[high] == modTareget) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] < modTareget) low++;
                    else high--;
                }
                while (j + 1 < nums.length && nums[j+1] == nums[j]) ++j;
            }
            while (i + 1 < nums.length && nums[i+1] == nums[i]) ++i;
        }
        return res;
    }
}
