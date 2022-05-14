package com.rana.contests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersection(nums).toArray());
    }
    static List<Integer> intersection(int[][] nums){
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        int i = 0;
        while (i < nums.length) {
            for (int j = 0; j < nums[i].length && i < nums.length-1; j++) {
                hs.add(nums[i][j]);
            }
            i++;
            for (int j = 0; j < nums[i].length && i < nums.length; j++) {
                if (hs.contains(nums[i][j])){
                    hs1.add(nums[i][j]);
                }
            }
            //i--;
        }
        //int index = 0;
        for (int x : hs1) {
            res.add(x);
        }
        return res;
    }
}
