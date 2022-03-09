package com.rana.dynamicProgramming;
//https://leetcode.com/problems/coin-change-2/
public class Change {
    public static void main(String[] args) {

        int[] coins = {1,2,5};
        int sum = 4;

        System.out.println(change(sum, coins));

    }
    static int change(int amount, int[] coins) {//coins.length = n, amount = w (Knapsack Problem)
        int[][] t = new int[coins.length+1][amount+1];

        for (int i = 0; i < t.length; i++) {
            t[i][0] = 1;
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (coins[i-1] <= j){
                    t[i][j] = t[i-1][j] + t[i][j- coins[i-1]];//unbounded knapsack
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[coins.length][amount];
    }
}
