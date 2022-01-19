package com.rana.recursion;
//https://leetcode.com/problems/power-of-three/
public class IsPowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(9));
        System.out.println(isPowerOfThree(12));
    }
    static boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 3 == 0) return isPowerOfThree(n / 3);
        else return false;
    }
}
