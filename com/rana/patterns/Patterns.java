package com.rana.patterns;

public class Patterns {
    public static void main(String[] args) {
        // write your code here
        pattern17(5);
    }
    static void pattern1(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= (n + 1) - rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int rows = 1; rows < 2 * n; rows++) {
            int c = rows > n ? (2 * n) - rows : rows;
            for (int cols = 1; cols <= c; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int rows = 1; rows <= 2 * n; rows++) {
            int c = rows > n ? (2 * n) - rows : rows;
            int noOfSpaces = n - c;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }
            for (int cols = c; cols >= 1; cols--) {
                System.out.print(cols + " ");
            }
            for (int cols = 2; cols <= c; cols++) {
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int rows = 1; rows < 2 * n; rows++) {
            int c = rows > n ? (2 * n) - rows : rows;
            int noOfSpaces = n - c;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= c; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int rows = 1; rows <= n; rows++) {
            int noOfSpaces = n - rows;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }
            for (int cols = rows; cols >= 1; cols--) {
                System.out.print(cols + " ");
            }
            for (int cols = 2; cols <= rows; cols++) {
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        for (int rows = 1; rows < 2 * n; rows++) {
            for (int cols = 1; cols < 2 * n; cols++) {

            }
        }
    }
}
