package com.rana.recursion;
//https://leetcode.com/problems/longest-common-subsequence/
//Amazon Citrix MakeMyTrip Paytm VMWare Microsoft
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String x = "abcde";
        String y = "ace";

        System.out.println(longestCommonSubsequence(x, y));

    }
    static int longestCommonSubsequence(String text1, String text2) {//recursion with memoization
        if (text1.length() == 0 || text2.length() == 0)
            return 0;

        if (text1 == null || text2 == null)
            return 0;

        int n = text1.length();
        int m = text2.length();

        int t[][] = new int[n+1][m+1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m +1; j++) {
                t[i][j] = -1;
            }
        }

        char[] x = text1.toCharArray();
        char[] y = text2.toCharArray();

        return lcs(x, y, x.length, y.length, t);
    }

    static int lcs(char[] x, char[] y, int n, int m, int[][] t) {
        if (n == 0 || m == 0)
            return 0;

        if (t[n][m] != -1)
            return t[n][m];

        if (x[n-1] == y[m-1]) {
            return t[n][m] = 1 + lcs(x, y, n - 1, m - 1, t);
        }
        else {
            return t[n][m] = Math.max(lcs(x, y, n - 1, m, t), lcs(x, y, n, m - 1, t));
        }
    }
    /**
    static int longestCommonSubsequence1(String text1, String text2) { //recursion
        if (text1.length() == 0 || text2.length() == 0)
            return 0;

        if (text1 == null || text2 == null)
            return 0;

        char[] x = text1.toCharArray();
        char[] y = text2.toCharArray();

        return lcs1(x, y, x.length, y.length);

    }
    static int lcs1(char[] x, char[] y, int n, int m) {
        if (n == 0 || m == 0)
            return 0;

        if (x[n-1] == y[m-1])
            return 1 + lcs(x, y, n-1, m-1);
        else
            return Math.max(lcs(x, y, n-1, m), lcs(x, y, n, m-1));
    }
     */
}
