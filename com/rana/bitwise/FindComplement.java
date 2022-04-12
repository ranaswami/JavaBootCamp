package com.rana.bitwise;
//https://leetcode.com/problems/number-complement/
public class FindComplement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement1(5));
    }
    static int findComplement(int num) {
        int i = 0;
        int j = 0;

        while (i < num){
            i = i + (int) Math.pow(2, j);
            j++;
        }
        return i - num;
    }
    static int findComplement1(int num) {
        int n = 0;
        while (n < num){
            n = (n << 1) | 1;//bitwise or operator (for addition purpose)
        }
        return n - num;
    }
}
