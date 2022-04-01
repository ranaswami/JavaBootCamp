package com.rana.arrays;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNumbers {

    public static void main(String[] args) {

        int[] nums = {555,901,482,1771};

        System.out.println(findNumbers(nums));
        System.out.println(2^4);

    }
    static int  findNumbers(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((int) Math.floor(Math.log10(nums[i]) + 1) % 2 ==0){
                res++;
            }
        }
        return res;
    }
}
