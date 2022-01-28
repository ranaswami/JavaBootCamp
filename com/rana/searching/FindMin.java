package com.rana.searching;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMin {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums) {
        if (nums.length == 0)
            return -1;
        if (nums.length == 1)
            return nums[0];

        int start = 0, end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1])//if the element at (mid - 1) > element at (mid), that the point of disturbance
                return nums[mid];
            else if (nums[start] <= nums[mid] && nums[mid] > nums[end])//if the element at start <= element at (mid) and element at (mid) > element at end
                start = mid + 1;//the point of disturbance is to the right of the mid, so mid + 1.
            else end = mid - 1;//else point of disturbance is to the left of the mid, so mid - 1.
        }
        return nums[start];
    }
}
