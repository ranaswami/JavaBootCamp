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
        System.out.println(Arrays.toString(combinationSum1(arr, target).toArray()));
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
                //System.out.println(Arrays.toString(tempList.toArray()));
                backTrack(res, tempList, candidates, remainingSum - candidates[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }
    static List<List<Integer>> combinationSum1(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        solve(0, candidates, target, res, new ArrayList<>());
        return res;
    }
    static void solve(int i, int[] arr, int target, List<List<Integer>> res, List<Integer> ds){
        if(i == arr.length){
            if(target == 0){
                res.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[i] <= target){
            ds.add(arr[i]);
            solve(i, arr, target-arr[i], res, ds);
            ds.remove(ds.size()-1);
        }
        solve(i+1, arr, target, res, ds);
    }
}
