package com.rana.bitwise;
//https://leetcode.com/problems/flipping-an-image/
import java.util.Arrays;
public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(image);
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            //reverse each row using two pointers method
            for (int i = 0; i < (image[0].length+1) / 2; i++) {
                //swap
                int temp = row[i] ^ 1; // flipping each element or complementing it
                row[i] = row[image[0].length - i - 1] ^ 1; // we can complement a no. by XOR it with 1
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
