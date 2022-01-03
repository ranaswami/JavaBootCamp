package com.rana.arrays;
//https://leetcode.com/problems/plus-one/
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;

        }
        int[] nums = new int[n+1];
        nums[0] = 1;
        return nums;

        /**
         j++;

         int length = 0;
         long temp = 1;
         while (temp <= j) {
         length++;
         temp *= 10;
         }

         int n = length;

         int[] nums = new int[n];

         int k = n - 1;

         while(j > 0 && k >= 0){

         nums[k] = j % 10;
         j = j / 10;

         k--;
         }
        return nums;
         */
    }
}
