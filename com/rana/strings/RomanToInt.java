package com.rana.strings;
//https://leetcode.com/problems/roman-to-integer/
import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        String s1 = "IV";
        System.out.println(romanToInt(s));
        System.out.println(romanToInt(s1));

    }
    static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
                sum += map.get(s.charAt(i)) - (2 * map.get(s.charAt(i - 1)));
            }
            else
                sum += map.get(s.charAt(i));

        }

        return sum;
    }
}
