package com.rana.hashing;
//https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1/

import java.util.ArrayList;
import java.util.Arrays;

public class CountDistinct {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,3};
        int n = 7;
        int k = 4;
        System.out.println(Arrays.toString(countDistinct(arr, n, k).toArray()));

    }
    static ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n-k ; i++) {
            list.add(windows(arr, i, k));
        }
        return list;
    }
    static int windows(int arr[], int num, int k){
        int count = 0;
        for (int i = num; i <num+k; i++) {

            int j;
            for (j = num; j <num+k; j++) {
                if (arr[i] == arr[j])
                    break;
            }
            if (j == i)
                count++;
        }
        return count;
    }
}
