package com.rana.arrays;
//https://leetcode.com/problems/set-matrix-zeroes/
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);

        /**
         * need to solve this question without using extra space like hashmap/set.
         */
    }
    static void setZeroes1(int[][] matrix) {
        HashMap<Integer, Boolean> rows = new HashMap<>();
        HashMap<Integer, Boolean> cols = new HashMap<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0){
                    rows.put(row, true);
                    cols.put(col, true);
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (rows.containsKey(row) || cols.containsKey(col)){
                    matrix[row][col] = 0;
                }
            }
        }
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
    static void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0){
                    rows.add(row);
                    cols.add(col);
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (rows.contains(row) || cols.contains(col)){
                    matrix[row][col] = 0;
                }
            }
        }
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
