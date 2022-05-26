package com.rana.recursion;
//https://practice.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1/
import java.util.ArrayList;
import java.util.Arrays;

public class NBitBinary {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(nBitBinary(n).toArray()));
    }
    static ArrayList<String> nBitBinary(int n) {
        ArrayList<String> list = new ArrayList<>();
        int ones = 0;
        int zeroes = 0;
        String op = "";
        solve(ones, zeroes, n,op, list);
        return list;
    }
    static void solve(int ones, int zeroes, int n,String op, ArrayList<String> list){
        if (n == 0){
            list.add(op);
            return;
        }

        StringBuilder s1 = new StringBuilder(op);
        s1.append('1');
        String op1 = s1.toString();
        solve(ones+1, zeroes, n-1, op1, list);

        if (ones > zeroes){
            StringBuilder s2 = new StringBuilder(op);
            s2.append('0');
            String op2 = s2.toString();
            solve(ones, zeroes+1, n-1, op2, list);
        }
    }
}
