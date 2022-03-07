package com.rana.recursion;
//https://leetcode.com/problems/perfect-squares/
//Solved the problem using recursion and memoization
import java.util.Arrays;
public class NumSquares {
    public static void main(String[] args) {

        int n = 12;
        int n1 = 13;

        System.out.println(numSquares(n));
        //System.out.println(numSquares(n1));

    }
    static int numSquares(int n) {
        int[] t = new int[n+1];
        Arrays.fill(t,-1);

        return solve(n, t);

    }
    static int ans = Integer.MAX_VALUE;

    static int solve(int n, int[] t) {
        if (n <= 3)
            return t[n] = n;

        if (t[n] != -1)
            return t[n];

        for (int i = 1; i * i <= n ; i++) {
            ans = Math.min(ans, 1 + solve(n - (i*i), t));
        }

        return t[n] = ans;
    }
}
