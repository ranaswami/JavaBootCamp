package com.rana.dynamicProgramming;
//https://leetcode.com/problems/coin-change/
public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int sum = 11;

        System.out.println(coinChange(coins, sum));
    }
    static int coinChange(int[] coins, int amount) {
        int[][] t = new int[coins.length+1][amount+1];

        for (int i = 0; i < t[0].length; i++) {//1st row
            t[0][i] = Integer.MAX_VALUE - 1;
        }
        /**
        for (int i = 1; i < t[0].length; i++) {//2nd row
            t[1][i] = Integer.MAX_VALUE - 1;
        }
        */
        for (int i = 1, j = 1; j < t[0].length; j++) {//2nd row
            if (j % coins[0] == 0){
                t[i][j] = j / coins[0];
            }
            else
                t[i][j] = Integer.MAX_VALUE - 1;
        }

        for (int i = 1; i < t.length; i++) {//1st column
            t[i][0] = 0;
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[0].length; j++) {
                if (coins[i-1] <= j){
                    t[i][j] = Math.min(t[i-1][j], t[i][j - coins[i-1]] + 1);
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }

        if (t[coins.length][amount] >= Integer.MAX_VALUE - 1)
            return -1;
        else
            return t[coins.length][amount];
    }
}
