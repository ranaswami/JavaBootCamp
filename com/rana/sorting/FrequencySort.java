package com.rana.sorting;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/sort-array-by-increasing-frequency/
public class FrequencySort {

    public static void main(String[] args) {

    }
    static int[] frequencySort(int[] nums) {
        int[] res = new int[nums.length];
        Map<Integer,Integer> map = new HashMap<>();
        int count = 1;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i], map.get(nums) + 1);
            }
        }

        

        return res;
    }
}
