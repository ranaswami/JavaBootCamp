package com.rana.arrays;
//https://leetcode.com/problems/find-the-highest-altitude/
public class LargestAltitude {

    public static void main(String[] args) {

        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));

    }
    static int largestAltitude(int[] gain) {
        int max=0, currLevel =0;
        int[] alt = new int[gain.length + 1];
        alt[0] = 0;
        for (int i = 1; i < alt.length; i++) {
            alt[i] = currLevel + gain[i-1];
            currLevel = alt[i];
        }

        for (int i = 0; i < alt.length; i++) {
            if (alt[i] > max){
                max = alt[i];
            }
        }

        return max;
    }
}
