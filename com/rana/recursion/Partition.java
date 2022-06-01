package com.rana.recursion;
//https://leetcode.com/problems/palindrome-partitioning/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partition {
    public static void main(String[] args) {
        //System.out.println(isPalindrome("madam"));
        System.out.println(Arrays.toString(partition("aab").toArray()));
    }
    static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        solve(0, s, res, new ArrayList<>());
        return res;
    }
    static void solve(int index, String s, List<List<String>> res, List<String> ds){
        if(index == s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i = index; i < s.length(); ++i){
            if(isPalindrome(s, index, i) == true){
                ds.add(s.substring(index, i+1));
                solve(i+1, s, res, ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    static boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
