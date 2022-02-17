package com.rana.sorting;
//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
import java.util.Arrays;

public class Average {
    public static void main(String[] args) {

    }
    static double average(int[] salary) {
        Arrays.sort(salary);

        double avg = 0;

        for (int i = 1; i < salary.length - 1; i++) {
            avg += (double) salary[i];
        }

        avg = avg / (double) (salary.length - 2);

        return avg;
    }
}
