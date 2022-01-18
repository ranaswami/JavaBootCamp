package com.rana.recursion;
//https://leetcode.com/problems/powx-n/
public class MyPow {

    public static void main(String[] args) {
        //System.out.println(myPow(3,9));
        System.out.println(myPow0(0.00001,2147483647));
        System.out.println(myPow0(2.00000,-2147483648));
        //System.out.println(myPow2(3,8));
    }
    static double myPow2(double x, int n) {
        //using iteration
        double res = 1;
        if (n < 0){
            long y = n * -1;
            for (long i = 1;i <= y;i++) {
                res = res * x;
            }
            res = 1 / res;
        }
        else {
            for (int i = 1; i <= n; i++) {
                res = res * x;
            }
        }
        return res;
    }

    static double myPow(double x, int n){
        //using recursion
        double res = 1;
        if (n==0){
            return res;
        }
        else if (n % 2 == 1){
            return x * myPow(x, n / 2) * myPow(x, n / 2);
        }
        else if (n < 0){
            n = n * -1;
            if (n % 2 == 1){
                return 1 / (x * myPow(x, n / 2) * myPow(x, n / 2));
            }
            else return 1 / (myPow(x, n / 2) * myPow(x, n / 2));
        }
        return myPow(x, n / 2) * myPow(x, n / 2);
    }
    static double myPow0(double x, int n){
        //using recursion(optimised)
        long m = n;
        if(m < 0)
            m = m * -1;
        double a = pow(x, m);
        return n >= 0 ? a : 1 / a;
    }
    static double pow(double x, long n){
        if (n == 0)
            return 1;
        return n % 2 == 0 ? pow(x*x, n/2) : x * pow(x*x, (n-1)/2);
    }
    static double myPow1(double x, int n){
        double res = 1.0;
        long y = n;
        if (y < 0)
            y = y * -1;
        while(y > 0){
            if (y % 2 == 1){
                res = res * x;
                y--;
            }
            else{
                x = x * x;
                y /= 2;
            }
        }
        if (n < 0)
            res = (double) (1.0) / (double) (res);
        return res;
    }
}
