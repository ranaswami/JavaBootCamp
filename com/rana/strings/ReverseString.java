package com.rana.strings;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);

        for (char ch : s) {//for each loop in Java
            System.out.print(ch+"  ");
        }
    }
    static void reverseString(char[] s) {
        if (s.length == 0)
            return;
        for (int start = 0,end = s.length - 1;start <= end;start++,end--){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
        }
    }
}
