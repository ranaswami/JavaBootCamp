package com.rana.recursion;

import java.util.*;

public class MaxLength {
    static int max = 0;
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("un");
        arr.add("iq");
        arr.add("ue");
        System.out.println(maxLength(arr));
    }
    static int maxLength(List<String> arr) {
        dfs(0, arr, "");
        return max;
    }
    static void dfs(int start, List<String> arr, String str){
        if (isUnique(str) == false){
            return;
        }
        max = Math.max(max, str.length());

        for (int i = start; i < arr.size(); i++) {
            String s = arr.get(i);
            dfs(i+1, arr, str+s);
        }
    }
    static boolean isUnique(String s){
        Set<Character> set = new HashSet<Character>();

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
