package com.rana.recursion;
//https://leetcode.com/problems/permutations-ii/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PermuteUnique {
    public static void main(String[] args) {
        int[] nums = {1,1,3};
        System.out.println(Arrays.toString(permuteUnique(nums).toArray()));
    }
    static List<List<Integer>> permuteUnique(int[] nums) {
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
        List<List<Integer>> finResult = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        //HashMap<List<Integer>, Integer> hashMap = new HashMap<>();
        for (List<Integer> list : res) {
            hs.add(list);
        }
        for (List<Integer> list : hs) {
            finResult.add(list);
        }
        return finResult;
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
