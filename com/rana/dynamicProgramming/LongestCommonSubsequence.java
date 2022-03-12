package com.rana.dynamicProgramming;
//https://leetcode.com/problems/longest-common-subsequence/
//Amazon Citrix MakeMyTrip Paytm VMWare Microsoft
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String x = "abcde";
        String y = "ace";

        System.out.println(longestCommonSubsequence(x, y));
    }
    static int longestCommonSubsequence(String text1, String text2) {// solving using top-down approach
        int[][] t = new int[text1.length()+1][text2.length()+1];// matrix which will contain right answer for the particular length of x & y strings.

        char[] x = text1.toCharArray();
        char[] y = text2.toCharArray();

        for (int i = 0; i < t[0].length; i++) {// Initialize 1st row with zero
            t[0][i] = 0;
        }

        for (int i = 1; i < t.length; i++) {// Initialize 1st column with zero
            t[i][0] = 0;
        }

        for (int i = 1; i < t.length; i++) {// try to visualize the matrix. At any particular row and column, the value of t[i][j] will be our output
            for (int j = 1; j < t[0].length; j++) {// for that particular row and column (i & j).
                if (x[i-1] == y[j-1])
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }

        return t[text1.length()][text2.length()];
    }
}
