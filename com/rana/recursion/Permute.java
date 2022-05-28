package com.rana.recursion;
//https://leetcode.com/problems/permutations/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permute {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(permute(nums).toArray()));

    }
    static List<List<Integer>> permute(int[] nums) {
        if (nums ==  null || nums.length == 0){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        /**
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        res.add(new ArrayList<>(numList));
         */
        solve(nums, res, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }
    static void solve(int[] nums, List<List<Integer>> res, List<Integer> currList, boolean[] used){
        if (currList.size() == nums.length){
            res.add(new ArrayList<>(currList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            currList.add(nums[i]);
            used[i] = true;
            solve(nums, res, currList, used);
            used[i] = false;
            currList.remove(currList.size()-1);
        }
    }
}
