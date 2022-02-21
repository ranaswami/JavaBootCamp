package com.rana.arrays;

public class FindRotation {
    public static void main(String[] args) {

    }
    static boolean findRotation(int[][] mat, int[][] target) {
        boolean b = false;

        int[][] temp = new int[mat[0].length][mat.length];

        int c = 0;
        for (int i = 0; i < mat.length; i++) {
            int r = 0;
            for (int j = 0; j < mat[i].length; j++) {
                temp[i][j] = mat[i][j];
            }
        }

        return b;
    }
}
