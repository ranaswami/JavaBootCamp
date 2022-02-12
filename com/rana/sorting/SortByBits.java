package com.rana.sorting;
//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
import java.util.Arrays;
import java.util.Comparator;

public class SortByBits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] arr1 = {1024,512,256,128,64,32,16,8,4,2,1};

        System.out.println(Arrays.toString(sortByBits(arr1)));
        System.out.println(Arrays.toString(sortByBits(arr)));


    }
    static int[] sortByBits(int[] arr) {
        Integer[] a = new Integer[arr.length];
        for (int i = 0; i < a.length; ++i)
            a[i] = arr[i];
        // Arrays.sort(a, (i, j) -> Integer.bitCount(i) != Integer.bitCount(j) ? Integer.bitCount(i) - Integer.bitCount(j) : i - j);
        Arrays.sort(a, Comparator.comparing(i -> Integer.bitCount(i) * 10000 + i));
        for (int i = 0; i < a.length; ++i)
            arr[i] = a[i];
        return arr;
    }
}
