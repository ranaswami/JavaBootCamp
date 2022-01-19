package com.rana.recursion;
//https://leetcode.com/problems/power-of-four/
public class IsPowerOfFour {

    public static void main(String[] args) {

        System.out.println(isPowerOfFour(9));
        System.out.println(isPowerOfFour(64));

    }
    static boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 4 == 0) return isPowerOfFour(n / 4);
        else return false;
    }
}
