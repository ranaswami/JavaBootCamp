package com.rana.recursion;
//https://leetcode.com/problems/count-good-numbers/
//Explanation: https://leetcode.com/problems/count-good-numbers/discuss/1317451/Java-or-Step-by-Step-clear-Explanation-with-Pictures-or-O(logN)
public class CountGoodNumbers {
    public static void main(String[] args) {
        long n = 50;
        System.out.println(countGoodNumbers(n));
    }
    static int countGoodNumbers(long n) {
        int mod = (int) Math.pow(10,9) + 7;

        long first = ((n&1) == 0 ? (n/2) : (n/2 + 1));//deciding n/2 or n/2+1 depending on n is even or odd
        long second = n/2;//second power would be n/2 only irrespective of even or odd

        long mul1 = power(5, first, mod) % mod;//5 power n/2
        long mul2 = power(4, second, mod) % mod;//4 power n/2

        long ans = 1;
        ans = (ans*mul1) % mod;//computing total product
        ans = (second != 0) ? ((ans*mul2) % mod) : ans;

        return (int) ans % mod;

    }
    static long power(long a, long b, int mod){//optimesd method to get pow(x,n) in O(log n) using divide & conquer
        long res = 1;

        while (b > 0){
            if ((b&1) != 0){
                res = (res * a % mod) % mod;// or res = (res % mod * a % mod) % mod;
            }
            a = (a % mod * a % mod) % mod;
            b = b >> 1;
        }
        return res;
        /**
         * we are doing % mod so that it does not exceed the integer or long value.
         */
    }
}
