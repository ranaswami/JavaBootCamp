package com.rana.searching;
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class CountNegatives {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    static int countNegatives1(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
    static int countNegatives(int[][] grid) {//since every row of the grid is sorted, we can find a way to solve it using binary search
        int finalCount = 0;

        for (int i = 0; i < grid.length; i++) {
            //go through each row and keep a count of number of -ve numbers
            int start = 0, end = grid[i].length - 1;
            int count = 0;
            while (start <= end){
                int mid = start + (end - start) / 2;
                if (grid[i][mid] >= 0)
                    start = mid + 1;
                else if (grid[i][mid] < 0){//if the encountered no. is -ve then all the numbers after that will be negative too
                    count += end - mid + 1;//increment the count and then decrement the end to search in other half of the row
                    end = mid - 1;
                }
            }
            finalCount += count;
        }
        return finalCount;//time complexity is O(m * log n) and space complexity is O(1).
    }
}
