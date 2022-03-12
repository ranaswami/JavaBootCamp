package com.rana.dynamicProgramming;
//https://leetcode.com/problems/maximum-length-of-repeated-subarray/
//Amazon Microsoft MorganStanley
public class FindLength {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};

        //output = [3,2,1]. (length)

        System.out.println(findLength(nums1, nums2));
    }
    static int findLength(int[] nums1, int[] nums2) {// it is same as of longest common substring just asked in a different way.
        int n = nums1.length, m = nums2.length;
        int[][] t = new int[n+1][m+1];

        for (int i = 0; i < t[0].length; i++) {// Initialize 1st row with zero
            t[0][i] = 0;
        }

        for (int i = 1; i < t.length; i++) {// Initialize 1st column with zero
            t[i][0] = 0;
        }

        int ans = 0;
        for (int i = 1; i < t.length; i++) {// try to visualize the matrix. At any particular row and column, the value of t[i][j] will be our output
            for (int j = 1; j < t[0].length; j++) {// for that particular row and column (i & j).
                if (nums1[i-1] == nums2[j-1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                    ans = Math.max(ans, t[i][j]);
                }
                else
                    t[i][j] = 0;
            }
        }
        return ans;
    }
}
