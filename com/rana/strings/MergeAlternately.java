package com.rana.strings;
//https://leetcode.com/problems/merge-strings-alternately/
public class MergeAlternately {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));
    }
    static String mergeAlternately(String word1, String word2) {
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < (word1.length() + word2.length()); i++) {
            if (i < word1.length()){
                b.append(word1.charAt(i));
            }
            if (i < word2.length()){
                b.append(word2.charAt(i));
            }
        }

        return b.toString();
    }
}
