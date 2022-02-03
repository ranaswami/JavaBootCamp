package com.rana.sortingAlgos;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int[] arr={5, 4, 3, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicSort(int[] arr){
        int i = 0;//check, swap, move; that's all.
        while (i < arr.length){
            int correctIndex = arr[i] - 1;//correctIndex = value - 1;
            if(arr[i] != arr[correctIndex]){//if the value at that particular index is not as it should be, SWAP with the value at the correctIndex
                swap(arr, i, correctIndex);
            }
            i++;
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
