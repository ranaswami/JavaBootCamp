package com.rana.searching;
//https://leetcode.com/problems/kth-missing-positive-number/
public class FindKthPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }

    static int findKthPositive(int[] arr, int k){
        int start = 0, end = arr.length - 1;
        int missing = compute(arr[arr.length - 1], arr.length);

        while (start <= end){
            int mid = start + (end - start) / 2;
            missing = compute(arr[mid], mid + 1);

            if (missing >= k){
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        if (end == -1) return k;
        return arr[end] + k - compute(arr[end], end+1);
    }

    static int compute(int actual, int expected){
        return actual - expected;
    }
}
