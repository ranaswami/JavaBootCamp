package com.rana.maths;

public class MySqrt {
    public static void main(String[] args) {
        int n = 10;
        int precision = 3;
        System.out.println(mySqrt(n));
        System.out.println(sqrt(40, precision));
    }
    static int mySqrt(int n) {
        if (n < 2)
            return n;
        long s = 0, e = n/2, res = 0;
        while (s <= e){
            long mid = s + (e - s) / 2;
            if (mid * mid <= n){
                res = mid;
                s = mid + 1;
            }
            else
                e = mid - 1;
        }
        return (int) res;
    }

    static double sqrt(int n, int p){
        double root = 0;

        int s = 0;
        int e = n;

        while (s <= e){
            int mid = s + (e - s) / 2;
            if (mid * mid == n)
                return mid;
            else if (mid * mid > n)
                e = mid - 1;
            else {
                s = mid + 1;
                root = mid;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
