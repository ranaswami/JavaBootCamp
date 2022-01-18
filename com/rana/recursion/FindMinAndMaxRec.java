package com.rana.recursion;
//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class FindMinAndMaxRec {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println(finMinRec(arr, n));
        System.out.println(findMaxRec(arr, n));
    }
    static int finMinRec(int[] arr,int n){
        if (n == 1)
            return arr[0];
        return Math.min(arr[n - 1], finMinRec(arr, n - 1));
    }

    static int findMaxRec(int[] arr,int n){
        if (n == 1)
            return arr[0];
        return Math.max(arr[n - 1], findMaxRec(arr, n - 1));
    }
}
