package com.rana.bitwise;

public class SingleNumber {
    public static void main(String[] args) {

    }
    static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
