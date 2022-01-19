package com.rana.recursion;
//https://www.codechef.com/problems/FIBXOR01/
public class SpecialFibonacci {
    public static void main(String[] args) {

    }
    static int specialFibonacci(int num){
        if (num == 0)
            return 2;
        if (num == 1)
            return 3;
        return specialFibonacci(num - 1) ^ specialFibonacci(num -2);
    }
}
