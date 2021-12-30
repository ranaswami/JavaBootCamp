package com.rana.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayAdd {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[x][y];

        if(arr1.length == arr2.length && n == y){

            System.out.println("Enter the 1st matrix");
            for (int rows = 0; rows < arr1.length; rows++) {
                for (int cols = 0; cols < arr1[rows].length; cols++) {
                    arr1[rows][cols] = in.nextInt();
                }
            }
            System.out.println("Enter the 2nd matrix");
            for (int rows = 0; rows < arr2.length; rows++) {
                for (int cols = 0; cols < arr2[rows].length; cols++) {
                    arr2[rows][cols] = in.nextInt();
                }
            }
            int[][] res = new int[m][n];
            for(int rows = 0;rows < arr1.length;rows++){
                for(int cols = 0;cols < arr1[rows].length;cols++){
                    res[rows][cols] = arr1[rows][cols] + arr2[rows][cols];
                }
            }

            //int[][] add = twoDArrayAdd(arr1,arr2);
            for(int[] ar : res){
                System.out.println(Arrays.toString(ar));
            }
            //System.out.println(Arrays.toString(res));
        }
        else {
            System.out.println("Matrices can't be added");
            return;
        }

    }
//    static int[][] twoDArrayAdd(int[][] arr1, int[][] arr2){
//        int[][] res = new int[arr1.length][];
//
//
//        return res;
//    }
}
