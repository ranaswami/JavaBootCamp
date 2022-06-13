package com.rana.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        System.out.println(uniqueOccurrences(arr));
    }
    static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num,0) + 1);
        }
        HashSet<Integer> hs = new HashSet<>(hm.values());
        //System.out.println(hm.size());
        //System.out.println(hs.size());
        return hm.size() == hs.size();
    }
}
