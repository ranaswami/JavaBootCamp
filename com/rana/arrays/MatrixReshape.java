package com.rana.arrays;

import java.util.Arrays;

public class MatrixReshape {

    public static void main(String[] args) {

        int[][] arr = {{1,2},
                {3,4},
                {5,6},
                {7,8}

        };
        int[][] array = matrixReshape(arr, 1, 4);

        for(int[] ar : array){
            System.out.println(Arrays.toString(ar));
        }

    }
    static int[][] matrixReshape(int[][] mat, int r, int c){
        int[][] newMatrix = new int[r][c];

        if(mat.length * mat[0].length == r*c) {
            int[] temp = new int[r * c];
            int k = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    temp[k] = mat[i][j];
                    k++;
                }
            }
            int l = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    newMatrix[i][j] = temp[l];
                    l++;
                }
            }
        } else
            return mat;
        return newMatrix;
    }
}
