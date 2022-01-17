package com.rana.recursion;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        reverseString(s, 0);
    }
    static void reverseString(char[] s, int next) {
        if (next >= s.length)
            return;

        // use recursion BEFORE printing in order to print in reversed order
        reverseString(s, next+1);
        System.out.print(s[next]+" ");

    }
}
