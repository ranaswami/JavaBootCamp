package com.rana.arrays;
//https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        List<Integer> res = addToArrayForm(num, k);

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
        }

    }
    static List<Integer> addToArrayForm0(int[] num, int k) {//this one was a nice approach but it exceeds the value of long
        List<Integer> li = new ArrayList<>();

        long sum = num[0];
        int i = 1;
        while (i < num.length){
            sum = sum * 10;
            sum = sum + num[i];
            i++;
        }
        long finalSum = sum + (long) k;
        String s = String.valueOf(finalSum);

        for (int j = 0; j < s.length(); j++) {
            li.add(s.charAt(j) - '0');
        }
        return li;
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int i=num.length-1;
        while(i>=0 || k>0)
        {
            if(i>=0)
                k=k+num[i];
            list.add(k%10);
            k/=10;
            i--;
        }
        Collections.reverse(list);
        return list;
    }
}
