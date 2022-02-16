package com.rana.arrays;
//https://leetcode.com/problems/product-of-array-except-self/
import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
        //System.out.println(Arrays.toString(productExceptSelf1(arr1)));

    }
    static int[] productExceptSelf1(int[] nums) {//brute force approach
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);//it will [0, 0, 0, 0] if we don't do this step
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i)
                    continue;
                else {
                    res[i] = res[i] * nums[j];
                }
            }
        }
        return res;
    }
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];

        //calculate lefts and store in res.
        int left = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0){
                left = left * nums[i - 1];
            }
            res[i] = left;
        }

        // Calculate rights and the product from the end of the array.
        int right = 1;
        for (int i = n-1; i >= 0; i--) {
            if (i < n - 1){
                right = right * nums[i + 1];
            }
            res[i] = right;
        }

        return res;
    }
}
