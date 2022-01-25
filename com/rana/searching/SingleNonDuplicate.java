package com.rana.searching;
//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
        //System.out.println(singleNonDuplicate1(nums));
    }
    static int singleNonDuplicate(int[] nums){//solution 1: in worst case this solution will have a time complexity of O(log n).
        int start = 0;
        int end = nums.length - 1;
        /**
         * Find the element appears only once.
         * we need to find the point of disturbance.
         */
        while (start < end){
            int mid = start + (end - start) / 2;
            if (mid % 2 == 0){
                if (nums[mid] == nums[mid + 1])
                    start = mid + 2;//case 1: [1,1,3,3,5] so now here nums[start] will be at 5, which is the solution in this case
                else
                    end = mid;//case 2: [1,1,2,3,3] so now here nums[end] will be at 2, which is the solution in this case
            }
            else {
                if (nums[mid] == nums[mid - 1])
                    start = mid + 1;//case 3: [1,1,2] so now here nums[start] will be at 2, which is the solution in this case
                else
                    end = mid - 1;//case 4: [0,1,1] so now here nums[end] will be at 0, which is the solution in this case
            }
        }
        return nums[start];//eventually nums[start] will be the point of disturbance (basically element which occurs once in the sorted array)
    }

    static int singleNonDuplicate1(int[] nums) {//solution 2: in worst case this solution will have a time complexity of O(n).
        if (nums.length == 1)
            return nums[0];
        //int res = 0;
        int n = 0;
        for (; n < nums.length; n++) {
            int first = firstOccurrence(nums, n);
            int last = latOccurrence(nums, n);
            if (first == last){
                break;
            }
        }

        return nums[n];
    }
    static int firstOccurrence(int[] nums, int i){
        int first = -1;

        int start = 0, end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == nums[i]){
                first = mid;
                end = mid - 1;
            }
            else if (nums[mid] < nums[i])
                start = mid + 1;
            else end = mid - 1;
        }

        return first;
    }
    static int latOccurrence(int[] nums, int i){
        int last = -1;

        int start = 0, end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (nums[mid] == nums[i]){
                last = mid;
                start = mid + 1;
            }
            else if (nums[mid] < nums[i])
                start = mid + 1;
            else end = mid - 1;
        }

        return last;
    }
}
