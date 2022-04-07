package com.rana.maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factor2(20);
        factor3(20);
    }
    //O(n)
    static void factor1(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i+" ");
        }
    }
    //O(sqrt(n))
    static void factor2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n/i == i)
                    System.out.print(i+" ");
                else
                    System.out.print(i+" "+n/i+" ");
            }
        }
        System.out.println();
    }

    //O(sqrt(n))
    static void factor3(int n){
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n/i == i)
                    System.out.print(i+" ");
                else {
                    System.out.print(i+" ");
                    li.add(n/i);
                }
            }
        }
        for (int i = li.size() - 1; i >= 0; i--) {
            System.out.print(li.get(i)+" ");
        }
    }

}
