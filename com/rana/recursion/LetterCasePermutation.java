package com.rana.recursion;
//https://leetcode.com/problems/letter-case-permutation/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        String s = "a1b2";
        System.out.println(Arrays.toString(letterCasePermutation(s).toArray()));
    }
    static List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        String ip = s;
        String op = "";
        solve(ip, op, list);
        return list;
    }
    static void solve(String ip, String op, List<String> list){
        if (ip.length() == 0){
            list.add(op);
            return;
        }
        if (Character.isDigit(ip.charAt(0)) == false){
            String op1 = op;
            String op2 = op;
            op1 += Character.toLowerCase(ip.charAt(0));
            op2 += Character.toUpperCase(ip.charAt(0));
            ip = ip.substring(1);

            solve(ip, op1, list);
            solve(ip, op2, list);
        } else {
            String op1 = op;
            op1 += ip.charAt(0);
            ip = ip.substring(1);
            solve(ip, op1, list);
        }
    }
}
