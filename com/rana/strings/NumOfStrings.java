package com.rana.strings;
//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
public class NumOfStrings {

    public static void main(String[] args) {
        String[] patterns = {"a","b","c"};
        String word = "aaaaabbbbb";

        System.out.println(numOfStrings(patterns, word));
    }
    static int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i]))
                count++;
        }

        return count;
    }
}
