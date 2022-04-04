package com.rana.sorting;
//https://leetcode.com/problems/group-anagrams/
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = groupAnagrams(strs);
        System.out.println(Arrays.toString(res.toArray()));

    }
    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String currentString : strs) {
            char[] chars = currentString.toCharArray();//to convert the 1st string in the string array to char array.
            Arrays.sort(chars);//sort the 1st string's character array and so on.
            String sorted = new String(chars);//to convert the char array to a string.

            if (!map.containsKey(sorted)){//if the map doesn't contain the sorted, add sorted as a new list in the hash map.
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(currentString);//if the map doesn't contain the sorted, add currentString as string in the hash map values.
        }
        groupedAnagrams.addAll(map.values());//add all the map values
        return groupedAnagrams;
    }
}
