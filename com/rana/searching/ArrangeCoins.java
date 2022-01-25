package com.rana.searching;
//https://leetcode.com/problems/arranging-coins/
public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(9));
    }
    static int arrangeCoins(int n) {
        int coinsLeft = n, count = 0;
        for (int i = 1; i <= n;i++){
            if (i <= coinsLeft){
                count++;
            }else break;
            coinsLeft -= i;
        }
        return count;
    }
}
