package com.rana.searching;
//https://leetcode.com/problems/sqrtx/
public class MySqrt {

    public static void main(String[] args) {
        //System.out.println(mySqrt1(4));
        //System.out.println(mySqrt1(2147395599));
        //System.out.println(mySqrt(4));
        System.out.println(mySqrt(2147395599));//2147483647 max int value in java
    }
    static int mySqrt1(int x) {
        if (x == 1)
            return 1;
        int sqrt = 0;
        int index = 0;
        for (int i = 0; i <= x / 2; i++) {
            int temp = (int) Math.pow(i,2);
            if (temp > sqrt && temp <= x){
                sqrt = temp;
                index = i;
            }
        }
        return index;
    }
    static int mySqrt(int x){
        if (x < 2)
            return x;
        long start = 0, end = x / 2, sqrt = 0;//here we have taken long because
        while (start <= end){
            long mid = start + (end - start) / 2;

            if (mid * mid <= x){//this might overflow the value of int in case of large int x value
                sqrt = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return (int) sqrt;
    }
}
