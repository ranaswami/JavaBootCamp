package com.rana.dynamicProgramming;
//https://practice.geeksforgeeks.org/problems/rod-cutting0840/1/#
public class CutRod {
    public static void main(String[] args) {
        int N = 8;
        int Price[] = {1, 5, 8, 9, 10, 17, 17, 20};

        System.out.println(cutRod(Price, N));
    }
    static int cutRod(int price[], int n) {
        //code here
        int[] length = new int[n];

        int len = 1;
        for (int i = 0; i < n; i++) {
            length[i] = len;
            len++;
        }

        int[][] t = new int[length.length+1][n+1];

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[0].length; j++) {
                if (length[i-1] <= j){
                    t[i][j] = Math.max(price[i-1] + t[i][j - length[i-1]], t[i-1][j]);
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[length.length][n];
    }
}
