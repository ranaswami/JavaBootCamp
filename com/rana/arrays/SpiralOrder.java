package com.rana.arrays;
//https://leetcode.com/problems/spiral-matrix/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> res = spiralOrder(matrix);
        //res.toArray();
        System.out.println(Arrays.toString(res.toArray()));
    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        if (matrix.length == 0)
            return res;

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd){
            //Traverse right
            for (int i = colBegin; i <= colEnd && res.size() < (matrix.length * matrix[0].length); i++) {
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            //Traverse down
            for (int i = rowBegin; i <= rowEnd && res.size() < (matrix.length * matrix[0].length); i++) {
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            //Traverse left
            for (int i = colEnd; i >= colBegin && res.size() < (matrix.length * matrix[0].length); i--) {
                res.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            //Traverse up
            for (int i = rowEnd; i >= rowBegin && res.size() < (matrix.length * matrix[0].length); i--) {
                res.add(matrix[i][colBegin]);
            }
            colBegin++;
        }

        return res;
    }
}
