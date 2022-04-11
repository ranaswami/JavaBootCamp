package com.rana.bitwise;
//https://leetcode.com/problems/counting-bits/
public class CountBits {
    public static void main(String[] args) {

    }
    static int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0; i <= n; i++) {
            res[i] = setBits(i);
        }
        return res;
    }
    static int setBits(int n) {
        int count = 0;
        /**
         while (n != 0){
         count++;
         //n & (-n) returns the right most set bit.
         n = n - (n & (-n));
         }
         */
        while (n != 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
