package com.rana.dynamicProgramming;
//https://leetcode.com/problems/perfect-squares/submissions/
//Solved the problem using Dynamic Programming
import java.util.Arrays;

public class NumSquares {
    public static void main(String[] args) {

        int n = 13;
        System.out.println(numSquares(n));

    }
    static int numSquares(int n) {
        int[] t = new int[n+1];
        Arrays.fill(t, Integer.MAX_VALUE);
        t[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                t[i] = Math.min(t[i], t[i - (j*j)] + 1);
            }
        }
        return t[n];
    }
}
