package com.rana.arrays;

public class Rob {
    public static void main(String[] args) {

    }
    static int rob(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                sum += nums[i];
            }
        }

        return sum;
    }
}
