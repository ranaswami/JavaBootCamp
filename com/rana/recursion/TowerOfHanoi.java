package com.rana.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int source = 1;
        int helper = 2;
        int destination = 3;
        int n = 3;
        //int count = 0;

        //towerOfHanoi(source, destination, helper, n);

        //System.out.println(towerOfHanoi1(source, destination, helper, n));
        toh(3, source, destination, helper);

    }
    static void towerOfHanoi(int source, int destination, int helper, int n) {

        if (n == 1){
            System.out.println("Move plate "+n+" from "+source+" to "+destination);
            return;
        }

        towerOfHanoi(source, helper, destination, n-1);
        System.out.println("Move plate "+n+" from "+source+" to "+destination);
        towerOfHanoi(helper, destination, source, n-1);
    }
    static long towerOfHanoi1(int source, int destination, int helper, int n){
        long count = 1;

        if (n == 1){
            return count;
        }

        count = count + towerOfHanoi1(source, helper, destination, n-1);

        count = count + towerOfHanoi1(helper, destination, source, n-1);

        return count;
    }
    static long toh(int N, int from, int to, int aux){
        long count = 1;
        if (N == 1){
            System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
            return count;
        }else {
            count = count + toh(N-1, from, aux, to);
            System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
            count = count + toh(N-1, aux, to, from);
        }
        return count;
    }
}
