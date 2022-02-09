package com.rana.sorting;
//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums, 4));
    }
    static int findKthLargest(int[] nums, int k) {
        int start = 0, end = nums.length - 1, index = nums.length - k;

        /**
         * the most straightforward way is to use quick select.
         * There is a simple conversion: Find kth largest element is equivalent to find (n - k)th smallest element in array.
         * It is worth mentioning that (n - k) is the real index (start from 0) of an element.
         */

        while (start < end){
            int pivot = partition(nums, start, end);
            if (pivot < index) start = pivot + 1;
            else if (pivot > index) end = pivot - 1;
            else return nums[pivot];
        }
        return nums[start];
    }
    static int partition(int[] arr, int start, int end){
        int pivot = start, temp;
        while (start <= end){
            while (start <= end && arr[start] <= arr[pivot]) start++;//if the pivot element is greater than or equal to arr[start]
            while (start <= end && arr[end] > arr[pivot]) end--;//if the pivot element is
            if (start > end) break;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        temp = arr[end];//swap the pivot element also end with the end, as pivot element also need to be swapped with element at the end position
        arr[end] = arr[pivot];
        arr[pivot] = temp;
        return end;
    }
}
