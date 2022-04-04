package com.rana.bitwise;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(powerOf2(0));

        System.out.println(anotherApproachPowerOf2(0));

    }
    static boolean powerOf2(int n){
        int count = 0;

        while (n > 0){
            int last = n & 1;
            if (last == 1)
                count++;
            n = n >> 1;
        }
        if (count == 1)
            return true;
        else return false;
    }
    static boolean anotherApproachPowerOf2(int n){
        if (n == 0) //note: fix for n = 0
            return false;
        if ((n & (n-1)) == 0)
            return true;
        else return false;
    }
}
