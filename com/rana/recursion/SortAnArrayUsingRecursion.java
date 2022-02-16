package com.rana.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAnArrayUsingRecursion {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

            arr.add(0);//0,1,5,3,2
            arr.add(1);
            arr.add(5);
            arr.add(3);
            arr.add(2);

        System.out.println(Arrays.toString(arr.toArray()));
        System.out.println();
        sortAnArrayUsingRecursion(arr);
        System.out.println(Arrays.toString(arr.toArray()));
    }
    static void sortAnArrayUsingRecursion(List<Integer> arr){
        if (arr.size() == 1)
            return;
        int temp = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        sortAnArrayUsingRecursion(arr);
        insert(arr, temp);
    }
    static void insert(List<Integer> arr, int temp){
        if (arr.size() == 0 || arr.get(arr.size() - 1) <= temp){
            arr.add(temp);
            return;
        }
        int val = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        insert(arr, temp);
        arr.add(val);

    }
}
