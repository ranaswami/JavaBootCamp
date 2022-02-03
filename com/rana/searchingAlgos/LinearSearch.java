package com.rana.searchingAlgos;

public class LinearSearch {

    public static void main(String[] args) {
        int[] a = {1,2,3,7};
        int t = 3;
        linearSearch(a,t);
    }
    static void linearSearch(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                System.out.println(i);
                break;
            }
        }
    }
}
