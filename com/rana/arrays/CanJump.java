package com.rana.arrays;
//https://leetcode.com/problems/jump-game/
public class CanJump {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }
    static boolean canJump(int[] nums) {
        int n = nums.length;
        int can_reach = 0;
        for (int i = 0; i <= can_reach ; ++i) {
            if (i == n-1)
                return true;
            can_reach = Math.max(can_reach, i + nums[i]);
        }
        return false;

        //the below is also right, and you can also find minimum no. of jumps

        /**
        if (n <= 1){
            System.out.println(0);
            return true;//0 jumps
        }

        int jumps = 0, interval1 = 0, interval2 = 0;
        while (true){
            jumps++;
            int can_reach = -1;
            for (int i = interval1; i <= interval2; ++i) {
                can_reach = Math.max(can_reach, i + nums[i]);
            }
            if (can_reach >= n - 1) {
                System.out.println(jumps);
                return true;
            }
            interval1 = interval2 + 1;
            interval2 = can_reach;
            if (interval1 > interval2)
                return false;
        }
        //assert false;
         */
    }
}
