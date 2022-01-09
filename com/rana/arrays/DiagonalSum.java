package com.rana.arrays;
//https://leetcode.com/problems/matrix-diagonal-sum/
public class DiagonalSum {

    public static void main(String[] args) {
        int[][] arr = {{1,2,9},
                    {3,4,10},
                    {5,6,6},
        };
        System.out.println(diagonalSum(arr));
    }
    static int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j){
                    sum += mat[i][j];
                }
                else if (i + j == mat[i].length - 1 && i != j){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
