package com.rana.sorting;
//https://leetcode.com/problems/largest-number/
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
    static String largestNumber(int[] nums) {
        StringBuilder b = new StringBuilder();

        if (nums == null || nums.length == 0)
            return "";
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //str[i] = Integer.toString(nums[i]);// Integer.toString(nums[i]) is slower
            str[i] = String.valueOf(nums[i]); //This is right one to use.
            //str[i] = nums+""; Never use this.
        }
        /**
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        });
         */
        Arrays.sort(str, (s1, s2) -> ((s2 + s1).compareTo(s1 + s2)));//lambda expression, lambda is much slower so we will use the above commented snippet
        //if (str[str.length - 1].charAt(0) == '0') return "0";
        if (str[0].equals("0")) return "0";
        for (String s : str) {
            b.append(s);
        }
        return b.toString();
    }
}
