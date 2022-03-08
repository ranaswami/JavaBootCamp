package com.rana.dynamicProgramming;

import java.util.Arrays;

public class MinCost {
    public static void main(String[] args) {

    }
    static int len = 0;//full stick length
    static int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        len = n;

        int l = cuts.length;

        int[][] t = new int[l+1][l+1];

        return rec(n, 0, cuts.length, cuts, t);
    }

    static int rec(int length, int startIndex, int endIndex, int[] cuts, int[][] t) {
        if (startIndex >= endIndex){
            return 0;
        }

        if (t[startIndex][endIndex] != 0)
            return t[startIndex][endIndex];

        int ans = Integer.MAX_VALUE;
        for (int cut = startIndex; cut < endIndex; cut++) {

            int leftEnd = startIndex == 0 ? 0 : cuts[startIndex - 1];
            int rightEnd = endIndex == cuts.length ? len : cuts[endIndex];

            int cost = rightEnd - leftEnd;

            int left = rec(leftEnd, startIndex, cut, cuts, t);
            int right = rec(rightEnd, cut+1, endIndex, cuts, t);

            int myAns = left + cost + right;

            ans = Math.min(ans, myAns);
        }

        return t[startIndex][endIndex] = ans;
    }
}
