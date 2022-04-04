package com.rana.bitwise;

public class NthFaithfulNum {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(nthFaithfulNum(n));

    }
    static long nthFaithfulNum(int n) {
        // code here
        long ans = 0;
        long base = 5;

        while (n > 0){
            int last = n & 1;
            n = n >> 1;
            ans = ans + last * base;
            base = base * 5;
        }

        return ans;
    }
}
