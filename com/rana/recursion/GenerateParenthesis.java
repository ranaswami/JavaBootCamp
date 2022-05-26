package com.rana.recursion;
//https://leetcode.com/problems/generate-parentheses/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(generateParenthesis(n).toArray()));
    }
    static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        int open = n;
        int close = n;
        String op = "";
        solve1(open, close, op, list);
        return list;
    }
    /**
    static void solve(int open, int close, String op, List<String> list){
        if (open == 0 && close == 0){
            list.add(op);
            return;
        }
        if (open != 0){
            String op1 = op;
            op1 += "(";
            solve(open-1, close, op1, list);
        }
        if (close > open){
            String op2 = op;
            op2 += ")";
            solve(open, close-1, op2, list);
        }
    }
     //This snippet is also but, in java as Strings are immutable this snippet will create new Strings everytime in the memory.
     */
    static void solve1(int open, int close, String op, List<String> list){
        if (open == 0 && close == 0){
            list.add(op);
            return;
        }
        if (open != 0){
            StringBuilder s1 = new StringBuilder(op);
            s1.append("(");
            String op1 = s1.toString();
            solve1(open-1, close, op1, list);
        }
        if (close > open){
            StringBuilder s2 = new StringBuilder(op);
            s2.append(")");
            String op2 = s2.toString();
            solve1(open, close-1, op2, list);
        }
    }
}
