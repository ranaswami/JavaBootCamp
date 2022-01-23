package com.rana.sorting;
//https://leetcode.com/problems/majority-element/
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
    }
    static int majorityElement(int[] nums) {
        int num = 0;

        if (nums.length == 1){
            return nums[0];
        }

        boolean[] check = new boolean[nums.length];
        check[0] = true;

        double m = (double) nums.length / (double) 2;

        int maxCount = 1;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] == nums[j] && check[j] == false){
                    count++;
                    check[j] = true;
                }
            }
            if (count > maxCount){
                maxCount = count;
                num = nums[i];
            }
        }

        if ((double) maxCount > m){
            return num;
        }
        else return -1;

        //return num;
    }
}
