package com.rana.bitwise;

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int power = 4;
        System.out.println(power(base, power));
    }
    static int power(int a, int n){
        int ans = 1;
        while (n > 0){
            if ((n & 1) == 1){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
}
