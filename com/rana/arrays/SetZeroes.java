package com.rana.arrays;

import java.util.HashMap;

//https://leetcode.com/problems/set-matrix-zeroes/
public class SetZeroes {
    public static void main(String[] args) {

    }
    static void setZeroes(int[][] matrix) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    map.put(i, j);
                }
            }
        }
        while (!map.isEmpty()){
            
        }
    }
}
