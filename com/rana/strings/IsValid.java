package com.rana.strings;

public class IsValid {

    public static void main(String[] args) {

    }
    static boolean isValid(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && s.charAt(i+1) == ')')
                a++;
            else if (s.charAt(i) == ')')
                a--;
            else if (s.charAt(i) == '{' && s.charAt(i+1) == '}')
                b++;
            else if (s.charAt(i) == '}')
                b--;
            else if (s.charAt(i) == '[' && s.charAt(i) == ']')
                c++;
            else if (s.charAt(i) == ']')
                c--;
        }
        if (a == 0 && b == 0 && c == 0)
            return true;

        return false;
    }
}
