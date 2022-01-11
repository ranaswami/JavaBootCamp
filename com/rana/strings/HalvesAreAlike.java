package com.rana.strings;
//https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class HalvesAreAlike {

    public static void main(String[] args) {
        String s = "Uo";
        //System.out.println(s.substring(0,1));
        //System.out.println(s.substring(2,4));
        //System.out.println(s.toUpperCase());

        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
        s.toLowerCase();

        String s1 = s.substring(0, s.length() / 2).toLowerCase();
        String s2 = s.substring(s.length() / 2, s.length()).toLowerCase();

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u'){
                count1++;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u'){
                count2++;
            }
        }
        if (count1 == count2)
            return true;
        return false;
    }
}
