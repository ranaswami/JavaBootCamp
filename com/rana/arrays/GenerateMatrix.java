package com.rana.arrays;
//https://leetcode.com/problems/spiral-matrix-ii/
import java.util.Arrays;

public class GenerateMatrix {
    public static void main(String[] args) {
        int n = 5;

        int[][] finalRes = generateMatrix(n);

        for (int[] arr : finalRes) {
            System.out.println(Arrays.toString(arr));
        }
    }

    static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int rowBegin = 0;
        int rowEnd = res.length - 1;
        int colBegin = 0;
        int colEnd = res[0].length - 1;

        int insertNumber = 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd){

            //Traverse right
            for (int i = colBegin; i <= colEnd ; i++) {
                res[rowBegin][i] = insertNumber;
                insertNumber++;
            }
            rowBegin++;

            //Traverse down
            for (int i = rowBegin; i <= rowEnd ; i++) {
                res[i][colEnd] = insertNumber;
                insertNumber++;
            }
            colEnd--;

            if (colBegin > colEnd || rowBegin > rowEnd)
                break;

            //Traverse left
            for (int i = colEnd; i >= colBegin ; i--) {
                res[rowEnd][i] = insertNumber;
                insertNumber++;
            }
            rowEnd--;

            //Traverse up
            for (int i = rowEnd; i >= rowBegin ; i--) {
                res[i][colBegin] = insertNumber;
                insertNumber++;
            }
            colBegin++;
        }

        return res;
    }
}
