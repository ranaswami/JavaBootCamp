package com.rana.recursion;
//Permutation with Case Change | Recursion
public class PermuteString {
    public static void main(String[] args) {
        String s = "abc";
        solve("", s);
    }
    static void solve(String op, String ip){
        if (ip.length() == 0){
            System.out.print(op+" ");
            return;
        }
        String op1 = op;
        String op2 = op;
        op1 += ip.charAt(0);
        op2 += Character.toUpperCase(ip.charAt(0));
        ip = ip.substring(1);

        solve(op1, ip);
        solve(op2, ip);
        //return;
    }
}
