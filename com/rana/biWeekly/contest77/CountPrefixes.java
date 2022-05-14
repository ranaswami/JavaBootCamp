package com.rana.biWeekly.contest77;

public class CountPrefixes {
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        System.out.println(countPrefixes(words, s));
    }
    static int countPrefixes(String[] words, String s) {
        int count = 0;
        boolean check = false;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == s.charAt(j)){
                    check = true;
                }
                else 
                    check = false;
            }
            if (check == true)
                count++;
        }
        return count;
    }
}
