package com.rana.sorting;
//https://leetcode.com/problems/merge-intervals/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = merge(intervals);
        for (int[] i : res) {
            System.out.println(Arrays.toString(i));
        }

    }
    static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        if (intervals.length == 0 || intervals == null)
            return res.toArray(new int[0][]);

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);//to sort a 2D array using lambdas

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] i : intervals) {
            if (i[0] <= end){
                end = Math.max(i[1], end);
            }
            else {
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start,end});

        return res.toArray(new int[0][]);
    }
}
