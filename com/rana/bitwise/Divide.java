package com.rana.bitwise;
//https://leetcode.com/problems/divide-two-integers/
public class Divide {
    public static void main(String[] args) {
        //System.out.println((1 << 31) - 1);
        System.out.println(divide(10, 3));
        System.out.println(divide(-1, -1));
    }
    static int divide(int dividend, int divisor) {
        if (dividend == 1 << 31 && divisor == -1)
            return (1 << 31) - 1;
        /**
         * the above code snippet is same as this code snippet
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
         */
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int res = 0;
        while (a - b >= 0){
            int x = 0;
            while (a - (b << 1 << x) >= 0){
                x++;
            }
            res += 1 << x;
            a -= b << x;
        }
        return (dividend > 0) == (divisor > 0) ? res : -res;
    }
}
