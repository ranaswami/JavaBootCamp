package com.rana.searching;
//https://leetcode.com/problems/find-right-interval/
import java.util.Arrays;
import java.util.HashMap;

public class FindRightInterval {
    public static void main(String[] args) {
        int[][] intervals = {{3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
        //System.out.println(Arrays.toString(findRightInterval1(intervals)));
    }
    static int[] findRightInterval(int[][] intervals) {//optimised approach using binary search and hash map.
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] first = new int[intervals.length];
        for (int i = 0; i < first.length; i++) {
            hm.put(intervals[i][0],i);
            first[i] = intervals[i][0];
        }

        Arrays.sort(first);

        int[] ans = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int present = binarySearch(first,intervals[i][1]);
            if (present == first.length)
                ans[i] = -1;
            else if (present == 0){
                if (intervals[i][1] <= first[0]){
                    ans[i] = hm.get(first[0]);
                }
                else
                    ans[i] = -1;
            }
            else
                ans[i] = hm.get(first[present]);
        }
        return ans;
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }
    static int[] findRightInterval1(int[][] intervals) {//naive approach
        int[] res = new int[intervals.length];
        if (intervals.length == 1)
            res[0] = -1;

        for (int i = 0; i < intervals.length; i++) {
            int minStart = Integer.MAX_VALUE;
            int index = -1;
            for (int j = 0; j < intervals.length; j++) {

                if (intervals[j][0] >= intervals[i][1] && minStart > intervals[j][0]){
                    index = j;
                    minStart = intervals[j][0];
                }
            }
            res[i] = index;
        }
        return res;
    }
}
