package com.rana.searching;
//https://leetcode.com/problems/intersection-of-two-arrays/
import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)){
                intersection.add(i);
            }
        }
        int[] res = new int[intersection.size()];
        int index = 0;
        for (int i : intersection) {
            res[index++] = i;
        }
        return res;
    }
}
