package com.rana.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GetMinCost {
    public static void main(String[] args) {
        //int n = 5;
        List<Integer> parcels = new ArrayList<>();
        parcels.add(2);
        parcels.add(3);
        parcels.add(6);
        parcels.add(10);
        parcels.add(11);

        int k = 9;

        System.out.println(getMinCost1(parcels, k));

    }
    static long getMinCost(List<Integer> parcels, int k){
        boolean[][] t = new boolean[parcels.size()+1][k+1];

        for (int i = 1; i < t.length; i++) {
            for (int j = 2; j < t[0].length; j++) {
                if (parcels.get(i-1) <= j){
                    t[i][j] = t[i-1][j - parcels.get(i-1)];
                    //|| t[i-1][j];
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        int number = 1;
        int capacity = 1;
        long sum = 0;

        while (number <= parcels.size() && capacity <= k){
            if (t[number][capacity] == true){
                sum += capacity;
            }
            number++;
            capacity++;
        }

        return sum;
    }
    static long getMinCost1(List<Integer> parcels, int k){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < parcels.size(); i++) {
            set.add(parcels.get(i));
        }

        k = k - parcels.size();

        int x = 1;
        long sum = 0;
        while (k>0){
            if (!set.contains(x)){
                k--;
                sum += x;
            }
            x++;
        }
        return sum;
    }
}
