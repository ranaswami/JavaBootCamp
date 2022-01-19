package com.rana.recursion;
//https://leetcode.com/problems/power-of-two/
public class IsPowerOfTwo {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo1(16));

    }
    static boolean isPowerOfTwo(int n) {//Brian Kernighan's algo:
        // Subtracting 1 from a decimal number flips all the bits after the rightmost set bit(which is 1) including the rightmost set bit.
        if (n <= 0)
            return false;
        else if ((n & n - 1) == 0)//doing add operation with any 2^n and 2^n - 1 will give zero.
            return true;
        else
            return false;
    }
    static boolean isPowerOfTwo1(int n){//using recursion
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 2 == 0) return isPowerOfTwo(n / 2);
        else return false;
    }
}
