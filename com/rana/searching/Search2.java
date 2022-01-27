package com.rana.searching;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class Search2 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        int target = 0;
        System.out.println(search(nums,target));

    }
    static boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end){
            if (nums[start] == target || nums[end] == target){
                return true;
            }
            else if (nums[start] < target){
                while (start < end && nums[start] == nums[start + 1]){//this is skip repeating elements in the array
                    start++;
                }
                start++;
            }
            else if (nums[end] > target){
                while (start < end && nums[end - 1] == nums[end]){//this is skip repeating elements in the array
                    end--;
                }
                end--;
            }
            else break;
        }
        return false;
    }
}
