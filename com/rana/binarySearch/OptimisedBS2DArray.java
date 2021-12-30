package com.rana.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class OptimisedBS2DArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        //int[] a = conversion(arr);
        System.out.println("Enter the target: ");
        int t = in.nextInt();

        System.out.println(Arrays.toString(optimisedBS2DArray(arr, t)));

    }

    // search in the row provided between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            else if(matrix[row][mid] < target)
                cStart = mid + 1;
            else
                cEnd = mid - 1;
        }
        return new int[]{-1,-1};
    }

    static int[] optimisedBS2DArray(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious over here, matrix may be empty
        if(cols == 0){
            return new int[]{-1,-1};
        }
        if (rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = (cols - 1) / 2;

        // run the loop till only 2 rows are remaining
        while (rStart < (rEnd - 1)){ //while this is true it will be having more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            else if (matrix[mid][cMid] < target)
                rStart = mid;
            else
                rEnd = mid;
        }
        // now we have 2 rows
        // check whether the target is in the column of 2 rows
        if (matrix[rStart][cMid] == target)
            return new int[]{rStart, cMid};
        if (matrix[rStart + 1][cMid] == target)
            return new int[]{rStart + 1, cMid};

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        else{ // search in 4th half
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

        // if (target >= matrix[rStart + 1][cMid + 1])
        // return new int[]{-1,-1};
    }
}
