package com.rana.recursion;
//https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
public class FindKthBit {
    public static void main(String[] args) {
        int n = 3;
        int k = 7;
        System.out.println(findKthBit0(3,7));
    }
    static char findKthBit0(int n, int k) {
        if (findKthBit1(n,k))
            return '1';
        else
            return '0';
    }
    static boolean findKthBit1(int n, int k) {
        if (n==1)
            return false;

        int len = (int) Math.pow(2, n) - 1;

        if (k == len / 2 + 1){
            return true;
        } else if(k < len / 2 + 1){
            return findKthBit1(n-1, k);
        } else {
            return findKthBit1(n-1, len - k + 1) == false ? true : false;
        }
    }
    static char findKthBit(int n, int k) {
        if (n == 1 && k == 1)
            return '0';

        int len = (1 << n) - 1;

        if (k == len / 2 + 1) {
            return '1';
        } else if (k > len / 2 + 1) {//try to observe the pattern of the output, you will get the ans
            return findKthBit(n - 1, len - k + 1) == '0' ? '1' : '0';
        } else {
            return findKthBit(n - 1, k);
        }
    }
}
