package com.rana.recursion;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    static int numberOfSteps(int num) {
        int count = 0;
        if (num <= 1)
            return num;
        if (num % 2 == 0){
            return (++count) + numberOfSteps(num / 2);//here instead of count+1, we can also use ++count.
            //numberOfSteps(num/2);
        }
        return (count+1) + numberOfSteps(num - 1);//here instead of count+1, we can also use ++count.

    }
}
