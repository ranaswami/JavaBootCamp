package com.rana.recursion;

public class MyPow {

    public static void main(String[] args) {
        System.out.println(myPow(3,9));
        System.out.println(myPow2(3,8));
    }
    static double myPow2(double x, int n) {
        //using iteration
        double res = 1;
        if (n < 0){
            n = n * -1;
            for (int i = 1;i <= n;i++) {
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
}
