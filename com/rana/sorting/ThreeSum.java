package com.rana.sorting;
//https://leetcode.com/problems/3sum/
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> res = threeSum1(nums);


    }
    static List<List<Integer>> threeSum0(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int temp1, temp2, temp3;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0){
                        set.add(i);
                        set.add(j);
                        set.add(k);
                        temp1 = nums[i];
                        temp2 = nums[j];
                        temp3 = nums[k];
                        nums[i] = Integer.MIN_VALUE;
                        nums[j] = Integer.MIN_VALUE;
                        nums[k] = Integer.MIN_VALUE;
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>();

        return list;
    }
    static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (hm.containsKey(nums[i])){
                int count0 = hm.get(nums[i]);
                hm.put(nums[i], count0++);
            }else if (!hm.containsKey(nums[i])){
                hm.put(nums[i], count);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int count0 = hm.get(nums[i]); // ensure count will be one of 0,1,2,3,...
            hm.put(nums[i], count0--);
            for (int j = i+1; j < nums.length; j++) {
                int count = hm.get(nums[j]); // ensure count will be one of 0,1,2,3,...
                hm.put(nums[j], count--);

                int c = -(nums[i]+nums[j]);
                if (hm.containsKey(c)){

                }
                hm.put(nums[j], count++);
            }
            hm.put(nums[i], count0++);
        }

        List<List<Integer>> list = new ArrayList<>();

        return list;
    }
    static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if(nums.length == 0)
            return res;

        int[] arr = mergeSort(nums);

        for (int i = 0; i < arr.length - 2; i++) {//because our a can go to 3rd last element in the array

            if (i == 0 ||(i > 0 && arr[i] != arr[i-1])) { //to skip the repeating elements like -1,-1,-1,-1 which are in the starting of the sorted array

                int low = i+1, high = arr.length-1, sum = 0 - arr[i];

                while (low < high){
                    if (arr[low] + arr[high] == sum){
                        res.add(Arrays.asList(arr[i], arr[low], arr[high]));

                        while (low < high && arr[low] == arr[low+1]) low++;
                        while (low < high && arr[high] == arr[high-1]) high--;
                        low++;
                        high--;
                    }
                    else if (arr[low] + arr[high] < sum) low++;
                    else high--;
                }
            }
        }

        return res;
    }
    static int[] mergeSort(int[] nums){
        if (nums.length == 1)
            return nums;

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                res[k] = left[i];
                i++;
            } else {
                res[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length){
            res[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            res[k] = right[j];
            j++;
            k++;
        }
        return res;
    }
}
