package com.rana.arrays;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int t = 2;
        System.out.println(Arrays.toString(searchIn2DArray(arr,t)));

    }
    static int[] searchIn2DArray(int[][] a, int target) {
        //int[] index = new int[2];

        int[] ar = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == target) {
                    ar = new int[]{i, j};
                    //index = new int[]{i, j};
                    //index[0] = i;
                    //index[1] = j;
                }
            }
        }
        return ar;
    }
}
