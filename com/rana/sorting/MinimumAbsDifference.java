package com.rana.sorting;
//https://leetcode.com/problems/minimum-absolute-difference/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> res = minimumAbsDifference(arr);
        System.out.println(Arrays.toString(res.toArray()));
    }
    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();

        if (arr.length == 0)
            return res;

        Arrays.sort(arr);

        int finalMin = Integer.MAX_VALUE;
        for (int i = arr.length - 1; i > 0 ; i--) {
            int min = (arr[i] - arr[i-1]);
            if (finalMin > min){
                finalMin = min;
            }
        }
        System.out.println(finalMin);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] - arr[i] == finalMin){
                res.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return res;
    }
    static List<List<Integer>> minimumAbsDifference1(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        if (arr.length == 0)
            return res;

        Arrays.sort(arr);

        int finalMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1 ; i++) {
            int min = (arr[i+1] - arr[i]);
            if (finalMin > min){
                finalMin = min;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i+1]));
            } else if (min == finalMin){
                res.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return res;
    }
}
