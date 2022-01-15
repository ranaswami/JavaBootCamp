package com.rana.strings;
//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        //System.out.println(s.replaceAll("\\s+", " "));
        //System.out.println(Arrays.toString(lengthOfLastWord(s)));
        //System.out.println(lengthOfLastWord());
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        //s.trim();
        //return 0;
        String b = s.replaceAll("\\s+", " ").trim();
        //s.trim();
        String[] s1 = b.split(" ");

        int x = s1[s1.length - 1].length();
        return x;
        //return s1;
    }
}
