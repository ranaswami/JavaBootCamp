package com.rana.searching;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        if (nums.length == 0)
            return arr;
        if (nums.length == 1 && nums[0] == target){
            arr[0] = 0;
            arr[1] = 0;
            return arr;
        }
        else if (nums.length == 1 && nums[0] != target){
            return arr;
        }
        int start = 0, end = nums.length - 1, first = -1, last = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == target){
                first = mid;
                end = mid - 1;//this step will make sure we remain in the first half of the first occurence of the target
            }
            else if (nums[mid] < target)
                start = mid + 1;
            else end = mid - 1;
        }
        int low = 0, high = nums.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;

            if (nums[mid] == target){
                last = mid;
                low = mid + 1;//this step will make sure we remain in the second half of the first occurence of the target
            }
            else if (nums[mid] < target)
                low = mid + 1;
            else high = mid - 1;
        }
        arr[0] = first;
        arr[1] = last;

        return arr;
    }
}
