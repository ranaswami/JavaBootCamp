package com.rana.searching;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersect {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2,2};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0)//no elements will be in intersection
            return nums1;
        if (nums2.length == 0)//no elements will be in intersection
            return nums2;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0;//two pointers
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for (int x : list) {
            res[index++] = x;
        }
        return res;
    }
}
