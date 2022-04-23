package com.rana.bitwise;
//https://leetcode.com/problems/gray-code/
//for explanation
//https://www.youtube.com/watch?v=R7uuIACpdGQ
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrayCode {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(grayCode(2).toArray()));
        System.out.println(Arrays.toString(grayCode1(2).toArray()));

    }
    static List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            list.add(i ^ i >> 1);
        }
        return list;
    }
    static List<Integer> grayCode1(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            list.add(i ^ i / 2);
        }
        return list;
    }
}
