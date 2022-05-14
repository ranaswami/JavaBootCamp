package com.rana.recursion;
//https://leetcode.com/problems/subsets-ii/
import java.util.*;

public class SubsetsWithDup {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(Arrays.toString(subsetsWithDup(nums).toArray()));

    }
    static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        result.add(new ArrayList<>()); // empty set
        subsets(0, nums, numList, result);

        List<List<Integer>> finResult = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        //HashMap<List<Integer>, Integer> hashMap = new HashMap<>();
        for (List<Integer> list : result) {
            hs.add(list);
        }
        for (List<Integer> list : hs) {
            finResult.add(list);
        }
        return finResult;
    }
    static void subsets(int offset, int[] nums, List<Integer> numList, List<List<Integer>> result) {
        if (offset >= nums.length) {
            return;
        }
        int val = nums[offset];
        // pick
        numList.add(val);
        subsets(offset + 1, nums, numList, result);
        // add to result
        result.add(new ArrayList<>(numList));
        // not pick
        numList.remove(numList.size() - 1);
        //System.out.println(offset);
        subsets(offset + 1, nums, numList, result);
    }
}
