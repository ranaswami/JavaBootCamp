package com.rana.searching;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        //int[] arr = {3,1,2};
        //int[] arr1 = {1,2,1,3,5,6,4};
        int[] arr2 = {1,1,1,1,1,1,1,1,1,1,1,2,3,5,6,4};

        //System.out.println(peakIndexInMountainArray(arr));
        //System.out.println(peakIndexInMountainArray(arr1));
        System.out.println(peakIndexInMountainArray0(arr2));
    }
    static int peakIndexInMountainArray1(int[] arr) {
        int max = Integer.MIN_VALUE, index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    static int peakIndexInMountainArray0(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else if (arr[mid] > arr[mid - 1])
                start = mid;
        }
        return -1;
    }
    static int peakIndexInMountainArray(int[] nums) {
        if(nums.length == 1) return 0; // single element

        int n = nums.length;

        // check if 0th/n-1th index is the peak element
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;

        // search in the remaining array
        int start = 1;
        int end = n-2;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            else if(nums[mid] < nums[mid-1]) end = mid - 1;
            else if(nums[mid] < nums[mid+1]) start = mid + 1;
        }
        return -1; // dummy return statement
        /**
         *         if (nums.length == 0)
         *             return -1;
         *         if (nums.length == 1)
         *             return nums.length - 1;
         *
         *         int start = 0, end = nums.length - 2;
         *
         *         while (start <= end){
         *             int mid = start + (end - start) / 2;
         *             if (mid > 0 && mid < nums.length - 1){
         *                 if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
         *                     return mid;
         *                 }
         *                 else if (nums[mid] > nums[mid + 1]){
         *                     end = mid - 1;
         *                 }
         *                 else if (nums[mid] > nums[mid - 1])
         *                     start = mid + 1;
         *             }
         *             else if (mid == 0){
         *                 if (nums[0] > nums[1]){
         *                     return 0;
         *                 }else return 1;
         *             }
         *             else if (mid == nums.length - 1){
         *                 if (nums[mid] > nums[mid - 1]){
         *                     return nums.length - 1;
         *                 }
         *                 else return nums.length - 2;
         *             }
         *         }
         *         return -1;
         */
    }
}
