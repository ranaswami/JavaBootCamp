package com.rana.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {

    public static void main(String[] args) {

        int[] arr = {2,3,5,1,3};

        int ex = 3;

        //System.out.println(Arrays.toString(kidsWithGreatestCandies(arr, ex)));
        List<Boolean> res = kidsWithGreatestCandies(arr, ex);

        int i = 0;
        while ((res.get(i)) != null){
            System.out.println(res.get(i));
            i++;
        }
    }
    static List<Boolean> kidsWithGreatestCandies(int[] candies, int extraCandies){
        int n = candies.length;
        List<Boolean> list = new ArrayList<>(n);
        int[] kids = new int[candies.length];

        int max = Integer.MIN_VALUE;

        for (int i = 0;i < candies.length;i++){
            kids[i] = candies[i] + extraCandies;
        }
        for (int i = 0;i < candies.length;i++){
            if (kids[i] > max){
                max = kids[i];
            }
        }
        for (int i = 0;i < n;i++){
            if (kids[i] == max){
                list.add(true);
            }
            else {
                list.add(false);

            }
        }
        return list;
    }
}
