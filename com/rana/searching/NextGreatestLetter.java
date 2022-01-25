package com.rana.searching;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class NextGreatestLetter {
    public static void main(String[] args) {
        System.out.println((char) 122);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        char res = 'z';
        for (char ch : letters) {
            if (ch <= target)
                continue;
            else {
                res =  ch;
                break;
            }
        }
        //char res1 = res;
        return res;
    }
}
