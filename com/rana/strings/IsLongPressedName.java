package com.rana.strings;
//https://leetcode.com/problems/long-pressed-name/
public class IsLongPressedName {

    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";

        String name1 = "saeed", typed1 = "ssaaedd";

        System.out.println(isLongPressedName(name, typed));

        System.out.println(isLongPressedName(name1, typed1));
    }
    static boolean isLongPressedName(String name, String typed) {
        int p1 = 0, p2 = 0;

        //typed has be equal to name or more than it
        if (typed.length() < name.length())
            return false;

        //if the first character of name doesn't match with the first character of typed
        if (name.charAt(0) != typed.charAt(0))
            return false;


        while (p1 < name.length() && p2 < typed.length()){
            char ch1 = name.charAt(p1);
            char ch2 = typed.charAt(p2);

            //only if both the characters are same, then only increment the pointer.
            if (ch1 == ch2)
                p1++;
            else if (p1 > 0 && name.charAt(p1 - 1) != ch2){
                //if the character from typed doesn't match the current character from
                // named string and also doesn't match with previous name character then return false;
                // handles : "alex" - "aaleelx"
                return false;
            }
            p2++;
        }
        //at the end of the loop, check if name string has not been processed completely
        if (p1 < name.length())
            return false;

        //check if last characters match the remaining characters
        char ch = name.charAt(name.length() - 1);
        while (p2 < typed.length()){
            char chP2 = typed.charAt(p2);
            if (ch != chP2)
                return false;
            p2++;
        }
        return true;
    }
}
