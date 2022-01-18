package com.rana.recursion;

import java.util.Arrays;

//https://www.geeksforgeeks.org/sum-triangle-from-array/
public class SumTriangleFromArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        sumTriangleFromArray(arr);

    }
    static void sumTriangleFromArray(int[] arr){
        if (arr.length < 1)//base condition
            return;

        int[] temp = new int[arr.length - 1];//initializing a new temp array on length - 1 than the previous array paased

        for (int i = 0;i < arr.length - 1;i++){//assigning values to the newly created temp array
            int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }
        sumTriangleFromArray(temp);//recursive call

        System.out.println(Arrays.toString(arr));//printing all the arrays
        // print the current array in the end so that smaller arrays are printed first
    }
}
