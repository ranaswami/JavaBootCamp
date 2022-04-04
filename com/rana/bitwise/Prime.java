package com.rana.bitwise;

public class Prime {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" "+isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if (n <= 1)
            return false;

        int check = 2;
        while (check * check <= n){
            if (n % check == 0)
                return false;
            check++;
        }
        return true;
    }
}
