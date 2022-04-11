package com.rana.bitwise;
//https://leetcode.com/problems/reverse-bits/
public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
    static int reverseBits(int n) {
        if (n == 0)
            return 0;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = res << 1;//to store reverse of the number in res.
            if ((n & 1) == 1)//to increment res by 1, if the input n has 1 as its last bit.
                res++;
            n = n >> 1;//to drop the last bit of the input n.
        }
        return res;
    }
}
