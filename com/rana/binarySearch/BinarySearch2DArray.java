package com.rana.binarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch2DArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        //int[] a = conversion(arr);
        int t = in.nextInt();
        System.out.println(binarySearch(conversion(arr),t));

        if(binarySearch(conversion(arr), t) != -1){
            for (int i = 0;i < arr.length;i++){
                for(int j = 0;j < arr[i].length;j++){
                    if (arr[i][j] == t){
                        System.out.println("Index of the target "+ t +" is: "+i+", "+j);
                    }
                }
            }
        }
    }
    //convert the 2D Array to 1D Array

    static int[] conversion(int[][] arr){
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                list.add(arr[i][j]);
            }
        }

        int[] vector = new int[list.size()];
        for(int i = 0;i < vector.length;i++){
            vector[i] = list.get(i);
        }
        return vector;
    }

    //binary search in the new 1D array

    static int binarySearch(int[] vector, int target){

        int start = 0;
        int end = vector.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (vector[mid] == target) {
                return mid;
            } else if (vector[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
