package com.rana.arrays;
//https://leetcode.com/problems/spiral-matrix-iii/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrixIII {
    public static void main(String[] args) {

        int[][] first = spiralMatrixIII1(1,4,0,0);
        int[][] second = spiralMatrixIII(5,6,1,4);

        for (int[] arr : first) {
            System.out.print(Arrays.toString(arr));
        }
        System.out.println();
        for (int[] arr : second) {
            System.out.print(Arrays.toString(arr));
        }

    }
    static int[][] spiralMatrixIII1(int rows, int cols, int rStart, int cStart) {

        int[][] direction = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}}; // east, south, west, north is 0, 1, 2, 3
        List<int[]> res = new ArrayList<>();

        int len = 0, dir = 0; // move <len> steps in the <d> direction
        res.add(new int[]{rStart, cStart});

        while (res.size() < rows * cols){ //fill all the blanks
            if (dir == 0 || dir == 2) len++; // when move east or west, the length of path need plus 1

            for (int i = 0; i < len; i++) {
                rStart = rStart + direction[dir][0];
                cStart = cStart + direction[dir][1];
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) // valid
                    res.add(new int[]{rStart,cStart});
            }
            dir = (dir + 1) % 4; //turn to next direction
        }

        return res.toArray(new int[rows * cols][2]);
    }
    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {//This function will be a little faster
        int[][] direction = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}}; // east, south, west, north is 0, 1, 2, 3
        int[][] res = new int[rows * cols][2];

        int len = 0, dir = 0, j = 0; // move <len> steps in the <d> direction
        res[j++] = new int[]{rStart, cStart};

        while (j < rows * cols){
            if (dir == 0 || dir == 2) len++; // when move east or west, the length of path need plus 1

            for (int i = 0; i < len; i++) {
                rStart = rStart + direction[dir][0];
                cStart = cStart + direction[dir][1];
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) // valid
                    res[j++] = new int[]{rStart,cStart};
            }
            dir = (dir + 1) % 4; //turn to next direction
        }

        return res;
    }
}
