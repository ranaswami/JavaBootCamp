package com.rana.sortingAlgos;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        //System.out.println(1/2);
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int high){
        if (low >= high)
            return;

        int s = low;
        int e = high;
        int mid = s + (e-s) / 2;
        int pivot = arr[mid];

        while (s <= e){
            //if it is already sorted no need to swap
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        //pivot is now at correct index, check for the two halves now.
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
