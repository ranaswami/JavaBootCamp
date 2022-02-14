package com.rana.recursion;
//https://leetcode.com/problems/combination-sum-ii/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = combinationSum2(arr, target);
        System.out.println(Arrays.toString(res.toArray()));
    }
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(res, new ArrayList<>(), candidates, target, 0);

        return res;
    }
    static void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] candidates, int remainingSum, int start) {
        if (remainingSum < 0)
            return;
        else if (remainingSum == 0)
            res.add(new ArrayList<>(tempList));//this is done, because Java passes variable by reference
        else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i-1])
                    continue;
                tempList.add(candidates[i]);
                //System.out.println(Arrays.toString(tempList.toArray()));
                backTrack(res, tempList, candidates, remainingSum - candidates[i], i + 1); // not i because we can't reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
