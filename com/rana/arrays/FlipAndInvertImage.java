package com.rana.arrays;
//https://leetcode.com/problems/flipping-an-image/
import java.util.Arrays;

public class FlipAndInvertImage {

    public static void main(String[] args) {
        int[][] image = {{1,2,3,4,5},
                        {1,2,3,4,5},
                        {1,2,3,4,5}};
        //System.out.println(Arrays.toString(rotateArray(image)));
        int[][] image1 = flipAndInvertImage(image);
        for(int[] ar : image1){
            System.out.println(Arrays.toString(ar));
        }

    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0, k = image[0].length - 1; j < image[i].length; j++, k--) {
                res[i][j] = image[i][k];
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                if (res[i][j] == 1){
                    res[i][j] = 0;
                }
            }

        }
        return res;
    }
    static int[] rotateArray(int[] image){
        int[] res = new int[image.length];

        for (int i = 0, j = image.length - 1; i < image.length; i++, j--) {
            res[i] = image[j];
        }
        return res;
    }
}
