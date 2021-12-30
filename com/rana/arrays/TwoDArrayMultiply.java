package com.rana.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayMultiply {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[x][y];

        if(n == arr2.length){

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

            int[][] res = new int[m][y];

            for (int rows = 0; rows < res.length; rows++) {
                for (int cols = 0; cols < res[rows].length; cols++) {
                    for(int pointer = 0;pointer < arr2.length;pointer++) {
                        res[rows][cols] = res[rows][cols] + (arr1[rows][pointer] * arr2[pointer][cols]);
                    }
                }
            }

            for(int[] ar : res){
                System.out.println(Arrays.toString(ar));
            }
        }
        else{
            System.out.println("Matrices can't be multiplied");
            //return;
        }

    }
}
