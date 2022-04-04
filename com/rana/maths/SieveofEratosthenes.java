package com.rana.maths;

import java.util.Arrays;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieveofEratosthenes(n, primes);

    }
    static void sieveofEratosthenes(int n, boolean[] primes){
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i * i <= n; i++) {

            for (int j = i * 2; j <= n ; j += i) {
                primes[j] = false;
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(primes[i])
                System.out.print(i+" ");
        }
    }
}
