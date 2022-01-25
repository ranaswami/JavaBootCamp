package com.rana.searching;
//https://leetcode.com/problems/valid-perfect-square/
public class IsPerfectSquare {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,8,9};
        int target = 3;
        System.out.println(findPlace(nums,target));
        //System.out.println(isPerfectSquare(9));

    }
    static boolean isPerfectSquare(int num) {
        if (num <= 1)
            return true;
        long start = 0, end = num / 2, sqrt = 0;

        while (start <= end){
            long mid = start + (end - start) / 2;

            if (mid * mid == num){//this might overflow the value of int in case of large int num value
                return true;
            }
            else if (mid * mid < num){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return false;
    }
    static int findPlace(int[] nums, int target){//this is not related to the above problem
        int first = -1, second = -1, index1 = -1, index2 = -1;
        int start = 0, end =nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] < target && first < nums[mid]){
                first = nums[mid];
                index1 = mid;
                start = mid + 1;//this step will make sure we remain in the first half of the first occurence of the target
            }
            else if (nums[mid] > target && second < nums[mid] && second >= first){
                second = nums[mid];
                index2 = mid;
                end = mid - 1;
            }
        }
        return index2+1;
    }
}
