package com.rana.sorting;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent2(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int[] arr = Arrays.copyOfRange(nums, 0 , nums.length);

        Arrays.sort(arr);
        int greaterThan = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0 && arr[i] != arr[i-1]){
                map.put(arr[i], greaterThan);
                greaterThan--;
            } else {
                map.put(arr[i], greaterThan - 2);
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            arr[i] = map.get(nums[i]);
        }

        return arr;
    }
    static int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] bucket = new int[101];
        int[] res = new int[nums.length];

        for (int i =0; i < nums.length; i++) {
            bucket[nums[i]]++;
        }

        for (int i = 1 ; i <= 100; i++) {
            bucket[i] += bucket[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = bucket[nums[i] - 1];
        }

        return res;
    }
    static int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] bucket = new int[102];

        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i] + 1]++;
        }
        for (int i = 1; i < bucket.length;i++){
            bucket[i] += bucket[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = bucket[nums[i]];
        }
        return nums;
    }
    static int[] smallerNumbersThanCurrent3(int[] nums) {
        int[] count = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            //count[i] = 0;
            for(int j = 0;j < nums.length;j++){
                if(nums[i] > nums[j])
                    count[i] = count[i] + 1;
            }
        }
        return count;
    }
}
