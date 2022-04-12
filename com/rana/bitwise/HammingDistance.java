package com.rana.bitwise;
//https://leetcode.com/problems/hamming-distance/
public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
        System.out.println(hammingDistance1(1, 4));
    }
    static int hammingDistance1(int x, int y) {
        int d = 0;
        int diffOfBits = x ^ y;

        while (diffOfBits != 0){
            if ((diffOfBits & 1) == 1)
                d++;
            diffOfBits = diffOfBits >> 1;
        }

        return d;
    }
    static int hammingDistance(int x, int y) {
        int res = 0;
        if (x == y)
            return res;
        int diffOfBits = x ^ y;

        return setBits(diffOfBits);
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
