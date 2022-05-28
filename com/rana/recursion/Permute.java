package com.rana.recursion;
//https://leetcode.com/problems/permutations/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permute {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(permute1(nums).toArray()));
        System.out.println(Arrays.toString(permute(nums).toArray()));
    }
    static List<List<Integer>> permute1(int[] nums) {
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
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        recurPermute(0, nums, res);
        return res;
    }
    static void recurPermute(int index, int[] nums, List<List<Integer>> res){
        if (index == nums.length){
            //copy the output to result
            List<Integer> op = new ArrayList<>();
            for (int num : nums) {
                op.add(num);
            }
            res.add(new ArrayList<>(op));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index+1, nums, res);
            swap(i, index, nums);
        }
    }
    static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
