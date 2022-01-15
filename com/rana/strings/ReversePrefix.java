package com.rana.strings;
//https://leetcode.com/problems/reverse-prefix-of-word/
public class ReversePrefix {

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word,ch));
    }
    static String reversePrefix(String word, char ch) {
        StringBuilder b = new StringBuilder();

        int index = word.indexOf(ch);

        String sub = word.substring(0,index + 1);
        b.append(sub);
        b.reverse();
        b.append(word.substring(index + 1, word.length()));
        return b.toString();
    }
}
