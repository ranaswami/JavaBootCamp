package com.rana.arrays;
//https://leetcode.com/problems/create-target-array-in-the-given-order/
import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {

    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] res = createTargetArray(nums, index);
        System.out.println(Arrays.toString(res));

    }
    static int[] createTargetArray(int[] nums, int[] index) {

//        boolean[] b = new boolean[nums.length];
//        int[] target = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            if (b[index[i]] == false) {
//                target[index[i]] = nums[i];
//                b[index[i]] = true;
//            }
//            if (b[index[i]] == true){
//                while (b[index[i]]){
//                    target[index[i+1]] = target[index[i]];
//                    index[i]++;
//                }
//            }
//        }

        ArrayList<Integer> a = new ArrayList<Integer>(nums.length);
        for (int i = 0;i < nums.length;i++){
            a.add(index[i],nums[i]);
        }

        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = a.get(i);
        }
        return target;
    }
}
