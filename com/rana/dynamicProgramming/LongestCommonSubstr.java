package com.rana.dynamicProgramming;
//https://practice.geeksforgeeks.org/problems/longest-common-substring1452/1
//Amazon Microsoft MorganStanley
public class LongestCommonSubstr {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abfce";
        int n = s1.length();
        int m = s2.length();

        System.out.println(longestCommonSubstr(s1, s2, n, m));

    }
    static int longestCommonSubstr(String text1, String text2, int n, int m){// solving using top-down approach
        // code here
        int[][] t = new int[n+1][m+1];// matrix which will contain right answer for the particular length of x & y strings.
        char[] x = text1.toCharArray();
        char[] y = text2.toCharArray();

        for (int i = 0; i < t[0].length; i++) {// Initialize 1st row with zero
            t[0][i] = 0;
        }

        for (int i = 1; i < t.length; i++) {// Initialize 1st column with zero
            t[i][0] = 0;
        }

        int ans = 0;
        for (int i = 1; i < t.length; i++) {// try to visualize the matrix. At any particular row and column, the value of t[i][j] will be our output
            for (int j = 1; j < t[0].length; j++) {// for that particular row and column (i & j).
                if (x[i-1] == y[j-1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                    ans = Math.max(ans, t[i][j]);
                }
                else
                    t[i][j] = 0;
            }
        }

        return ans;
    }
}
