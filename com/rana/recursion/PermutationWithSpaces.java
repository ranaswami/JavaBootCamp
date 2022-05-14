package com.rana.recursion;
import java.util.ArrayList;
import java.util.Arrays;
//https://practice.geeksforgeeks.org/problems/permutation-with-spaces3627/1
public class PermutationWithSpaces {
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(Arrays.toString(permutation(str).toArray()));
    }
    static ArrayList<String> permutation(String S){
        // Code Here
        String op = "";
        op += S.charAt(0);
        S = S.substring(1);
        solve(op, S);
        return list;
    }
    static void solve(String op, String ip){
        if (ip.length() == 0){
            list.add(op);
            return;
        }
        char ch = ip.charAt(0);
        solve(op+" "+ch, ip.substring(1));
        solve(op+ch, ip.substring(1));
    }
}
