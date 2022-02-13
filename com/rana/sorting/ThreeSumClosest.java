package com.rana.sorting;
//https://leetcode.com/problems/3sum-closest/
import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {0,1,2};
        int target = 3;
        System.out.println(threeSumClosest(nums, target));

    }
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[nums.length - 1];
        int closestSum = sum;

        for(int i = 0; i < nums.length - 2; i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int left = i + 1, right = nums.length - 1;
                while(left < right){
                    sum = nums[left] + nums[right] + nums[i];
                    if(sum < target){
                        //move closer to target sum.
                        while(left<right && nums[left] == nums[left+1]){
                            left++;
                        }
                        left++;
                    }else if(sum > target){
                        //move closer to target sum.
                        while(left<right && nums[right] == nums[right-1]){
                            right--;
                        }
                        right--;
                    }else{
                        return sum;
                    }
                    //update the closest sum if needed.
                    if(Math.abs(target - sum) < Math.abs(target - closestSum)){
                        closestSum = sum;
                    }
                }
            }

        }
        return closestSum;
    }
}
