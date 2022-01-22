package com.rana.arrays;
//https://leetcode.com/problems/transpose-matrix/
import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        //int[][] res = transpose(matrix);

        for (int[] ar : transpose(matrix)) {
            System.out.print(Arrays.toString(ar)+" ");
        }
    }
    static int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];

        int c = 0;
        for (int i = 0 ; i < matrix.length; i++) {
            int r = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                res[r][c] = matrix[i][j];
                r++;
            }
            c++;
        }
        /**
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {  both the code snippets are right.
                res[j][i] = matrix[i][j];
            }
        }
        */
        return res;
    }
}
