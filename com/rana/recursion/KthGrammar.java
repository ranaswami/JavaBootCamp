package com.rana.recursion;
//https://leetcode.com/problems/k-th-symbol-in-grammar/
public class KthGrammar {
    public static void main(String[] args) {
        int n = 2;
        int k = 2;
        int n1 = 3;
        int k1 = 4;

        System.out.println(kthGrammar(n, k));
        System.out.println(kthGrammar(n1, k1));

    }
    static int kthGrammar(int n, int k) {

        if (kthGrammar1(n,k)){
            return 1;
        }
        else return 0;
    }
    static boolean kthGrammar1(int n, int k) {
        boolean b;
        if (n == 1 && k==1)//base condition
            return false;

        int mid = (int) Math.pow(2, (n-1)) / 2;

        if (k <= mid){//Induction 1
            b = kthGrammar1(n-1, k);
        } else {//Induction 2
            b = !kthGrammar1(n-1, k-mid);
        }
        return b;
    }
}
