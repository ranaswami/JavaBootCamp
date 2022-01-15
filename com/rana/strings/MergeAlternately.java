package com.rana.strings;

public class MergeAlternately {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));
    }
    static String mergeAlternately(String word1, String word2) {
        StringBuilder b = new StringBuilder();

        for (int i = 0, j = 0, k = 0; i < (word1.length() + word2.length()); i++, j++, k++) {
            if (i % 2 == 0 && i < word1.length()) {
                b.append(word1.charAt(j));
                k--;
            }
            else if (i % 2 == 1 && i < word2.length()) {
                b.append(word2.charAt(k));
                j--;
            }
        }

        return b.toString();
    }
}
