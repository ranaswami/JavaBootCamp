package com.rana.recursion;

import java.util.ArrayList;
import java.util.List;

public class Partition {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
    static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();

        return res;
    }
    static boolean isPalindrome(String s){
        StringBuilder s1 = new StringBuilder(s);
        String s2 = s1.reverse().toString();
        if (s.equals(s2))
            return true;
        else return false;
    }
}
