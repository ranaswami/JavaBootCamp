package com.rana.arrays;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,3,4,4,4,9,9,9,9};

        System.out.println(removeDuplicates(arr));

    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        //two pointer method and can also be done using hashset, but in that case time and space time complexities will change.Keep that in mind.
        int i = 0;
        for(int j = 1;j < nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

