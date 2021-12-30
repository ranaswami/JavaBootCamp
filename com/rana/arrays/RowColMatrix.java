package com.rana.arrays;

import java.util.Arrays;

public class RowColMatrix {

    public static void main(String[] args) {

        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int t = 50;

        System.out.println(Arrays.toString(search(arr,t)));

    }
    static int[] search(int[][] matrix, int target){
        int rows = 0;
        int cols = matrix.length - 1;

        while(rows < matrix.length && cols >= 0){
            if(matrix[rows][cols] == target){
                return new int[]{rows,cols};
            }
            else if(matrix[rows][cols] < target)
                rows++;
            else
                cols--;
        }
        return new int[]{-1,-1};
    }
}
