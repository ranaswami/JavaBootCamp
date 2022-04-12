package com.rana.bitwise;

import java.util.*;

public class SubsetsWithDup {
    public static void main(String[] args) {

    }
    static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), res, false);
        return res;
    }
    static void solve(int[] nums, int i, List<Integer> op, List<List<Integer>> res, boolean choosePre) {
        if (i == nums.length){
            res.add(new ArrayList<>(op));
            return;
        }

        solve(nums, i+1, op, res, false);
        if (i >= 1 && nums[i] == nums[i-1] && !choosePre)
            return;
        op.add(nums[i]);
        System.out.println(Arrays.toString(op.toArray()));
        solve(nums, i+1, op, res, true);
        op.remove(op.size() - 1);
    }
}
