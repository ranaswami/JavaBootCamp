package com.rana.bitwise;
//https://leetcode.com/problems/number-of-1-bits/
public class HammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(7));
        System.out.println(0<<1);
    }
    static int hammingWeight(int n) {
        int count = 0;
        while (n != 0){//
            count++;
            n -= n & (-n);
        }
        return count;
    }
}
