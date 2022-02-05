package com.rana.sorting;
//https://leetcode.com/problems/two-sum/
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum0(int[] nums, int target) {//brute force approach
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    set.add(i);
                    set.add(j);
                    //int temp1 = nums[i];
                    nums[i] = Integer.MIN_VALUE;
                    //int temp2 = nums[j];
                    nums[j] = Integer.MIN_VALUE;
                }
            }
        }
        int index = 0;
        //set.toArray();
        for (int i : set) {
            res[index++] = i;
        }
        return res;
    }
    static int[] twoSum(int[] nums, int target) {//optimised approach using map to store key value pair
        Map<Integer,Integer> valueIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (valueIndex.containsKey(target - nums[i])){
                return new int[] {valueIndex.get(target - nums[i]), i};
            }
            else {
                valueIndex.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
