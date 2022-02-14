package com.rana.recursion;
//https://leetcode.com/problems/combination-sum/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {

        int[] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> res = combinationSum(arr, target);
        System.out.println(Arrays.toString(res.toArray()));
    }
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        //Arrays.sort(candidates); // no need to do this
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
                tempList.add(candidates[i]);
                System.out.println(Arrays.toString(tempList.toArray()));
                backTrack(res, tempList, candidates, remainingSum - candidates[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}
