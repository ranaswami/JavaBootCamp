package com.rana.strings;

import java.util.LinkedList;
import java.util.Queue;

public class CanReach {

    public static void main(String[] args) {
        String s = "011010";
        int minJump = 2;
        int maxJump = 3;
        String s1 = "01101110";

        System.out.println(canReach(s, minJump, maxJump));
        System.out.println(canReach(s1, minJump,maxJump));

    }
    static boolean canReach(String s, int minJump, int maxJump) {
        if(s == null || s.length() == 0) return false;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        //In this solution, we are going to iterate the string only once and implement BFS with the help of a queue.

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {

                while (!queue.isEmpty() && queue.peek() < i - maxJump)
                    queue.poll();// to remove first input in the queue from where we can't reach i, even after adding maxJump to it.

                if (queue.isEmpty()) return false;
                int prev = queue.peek();
                if (prev+maxJump >= i && prev+minJump <= i){
                    queue.offer(i);//to add an index which is a middle ground or destination, fulfilling all the criterion
                    if (i == s.length() - 1) return true;//and if we reach the last element of the string fulfilling all the criterion, return true.
                }
            }
        }
        return false;
    }
}
