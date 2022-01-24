package com.rana.searching;
//https://leetcode.com/problems/valid-perfect-square/
public class IsPerfectSquare {
    public static void main(String[] args) {

        System.out.println(isPerfectSquare(9));

    }
    static boolean isPerfectSquare(int num) {
        if (num <= 1)
            return true;
        long start = 0, end = num / 2, sqrt = 0;

        while (start <= end){
            long mid = start + (end - start) / 2;

            if (mid * mid == num){//this might overflow the value of int in case of large int num value
                return true;
            }
            else if (mid * mid < num){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return false;
    }
}
