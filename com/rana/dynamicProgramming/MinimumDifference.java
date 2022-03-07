package com.rana.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class MinimumDifference {
    public static void main(String[] args) {

    }
    static int minimumDifference(int[] nums) {
        int arrSum = 0;
        for (int i = 0; i < nums.length; i++) {
            arrSum += nums[i];
        }

        int[] rangeArray = subsetSum(nums, Math.abs(arrSum));

        int mn = Integer.MAX_VALUE;

        for (int i = 0; i < rangeArray.length; i++) {
            mn = Math.min(mn, arrSum - 2 * rangeArray[i]);
        }

        return mn;
    }
    static int[] subsetSum(int[] arr, int sum){
        boolean[][] t = new boolean[arr.length+1][sum+1];

        for (int i = 0;i < t.length;i++){
            t[i][0] = true;
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (arr[i-1] <= j){
                    t[i][j] = t[i-1][j - Math.abs(arr[i-1])] || t[i-1][j];
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        List<Integer> res = new ArrayList<>();

        int lastRow = arr.length;
        for (int i = 0; i < t[0].length/2; i++) {
            if (t[lastRow][i] == true)
                res.add(i);
        }

        int[] result = new int[res.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
