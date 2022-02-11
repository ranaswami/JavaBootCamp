package com.rana.sorting;
//https://leetcode.com/problems/rank-transform-of-an-array/
import java.util.Arrays;
import java.util.HashMap;

public class ArrayRankTransform {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] arr1 = {20, 20, 20};
        System.out.println(Arrays.toString(arrayRankTransform(arr1)));
        System.out.println(Arrays.toString(arrayRankTransform(arr)));

    }
    static int[] arrayRankTransform(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int[] nums = Arrays.copyOfRange(arr, 0 , arr.length);

        Arrays.sort(nums);

        int rank = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i+1 < nums.length && nums[i] != nums[i+1]){
                map.put(nums[i], rank);
                rank++;
            } else {
                map.put(nums[i], rank);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            nums[i] = map.get(arr[i]);
        }
        return nums;
    }
}
