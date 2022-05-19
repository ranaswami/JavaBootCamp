package com.rana.bitwise;
//https://practice.geeksforgeeks.org/problems/power-set4302/1
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllPossibleStrings {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(Arrays.toString(AllPossibleStrings(s).toArray()));
    }
    static List<String> AllPossibleStrings(String s) {
        ArrayList<String> ans = new ArrayList<>();
        int n = s.length();

        for (int num = 0; num < (1 << n); num++) {
            String sub = "";
            for (int i = 0; i < n; i++) {
                //check if the ith bit is set or not
                if ((num & (1 << i)) != 0){
                    sub += s.charAt(i);
                }
            }
            if (sub.length() > 0){
                ans.add(sub);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
