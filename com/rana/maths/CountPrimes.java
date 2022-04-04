package com.rana.maths;
//https://leetcode.com/problems/count-primes/
import java.util.Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(countPrimes(n));
    }
    static int countPrimes(int n) {
        if (n <= 1)
            return 0;
        boolean[] primes = new boolean[n+1];
        return sieveofEratosthenes(n, primes);
    }
    static int sieveofEratosthenes(int n, boolean[] primes){
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i * i <= n; i++) {

            for (int j = i * 2; j <= n ; j += i) {
                primes[j] = false;
            }
        }

        int count = 0;
        for (int i = 2; i < n ; i++) {
            if(primes[i])
                count++;
        }
        return count;
    }
}
