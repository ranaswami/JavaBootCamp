package com.rana.strings;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseWords {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        StringBuilder b = new StringBuilder();
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (i == str.length - 1){
                StringBuilder sb = new StringBuilder();
                sb.append(str[i]);
                sb.reverse();
                b.append(sb);
                continue;
                //break;
                //here both break and continue will work fine.
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str[i]);
            sb.reverse();
            b.append(sb).append(" ");
        }
        return b.toString();
    }
}
