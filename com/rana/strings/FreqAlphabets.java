package com.rana.strings;
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class FreqAlphabets {

    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println('9' - '1');
        System.out.println(freqAlphabets(s));

    }
    static String freqAlphabets(String s) {
        StringBuilder b = new StringBuilder();

        int n = s.length();
        for (int i = 0; i < n; ) {
            if (i < n - 2 && s.charAt(i + 2) == '#'){
                int num = Integer.parseInt(s.substring(i,i+2));
                b.append((char) (num + 96));
                i += 3;
                continue;
            }
            b.append((char) (s.charAt(i) - '0' + 96));
            i++;
        }
        return b.toString();
    }
}
