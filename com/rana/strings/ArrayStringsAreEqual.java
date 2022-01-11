package com.rana.strings;
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class ArrayStringsAreEqual {

    public static void main(String[] args) {

        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word1, word2));

    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder b1 = new StringBuilder();
        StringBuilder b2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            b1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            b2.append(word2[i]);
        }
        //System.out.println(b1);
        //System.out.println(b2);
        if(b1.toString().contentEquals(b2.toString())){
            return true;
        }
        return false;
    }
}
