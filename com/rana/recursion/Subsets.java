package com.rana.recursion;
//https://leetcode.com/problems/subsets/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        //int[] nums = {1,2,3};
        //System.out.println(Arrays.toString(subsets(nums).toArray()));
        int x = 5514;
        System.out.println(count(x));

    }
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), res);
        return res;
    }
    static void solve(int[] nums, int i, List<Integer> op, List<List<Integer>> res) {
        if (i == nums.length){
            res.add(new ArrayList<>(op));
            return;
        }

        solve(nums, i+1, op, res);

        op.add(nums[i]);
        System.out.println(Arrays.toString(op.toArray()));
        solve(nums, i+1, op, res);
        op.remove(op.size() - 1);

    }
    static int count(int x){
        int count = 0;

        for (int i = 1; i <= x; i++) {
            int sum = sum(i);
            System.out.println(sum);
            int digits = digits(i);
            System.out.println(digits);
            int s = (int) Math.pow(sum, digits);

            if (isPrime(s)){
                count++;
            }
            if (digits(s) == digits){
                count++;
            }
            //count -= digits;
        }

        return count;
    }
    static int sum(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    static int digits(int num){
        int digits = 0;
        while (num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }
    static boolean isPrime(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }
}
