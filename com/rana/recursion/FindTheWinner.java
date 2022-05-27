package com.rana.recursion;
//https://leetcode.com/problems/find-the-winner-of-the-circular-game/
//Josephus Problem
import java.util.ArrayList;

public class FindTheWinner {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(5, 2));
    }
    static int findTheWinner(int n, int k) {
        ArrayList<Integer> friend = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            friend.add(i);
        }
        return solve(friend, 0, k);
    }

    static int solve(ArrayList<Integer> friend, int curr, int k) {
        if (friend.size() == 1){
            return friend.get(0);
        }
        int toRemove = (curr + (k-1)) % friend.size();
        friend.remove(toRemove);

        return solve(friend, toRemove, k);
    }
}
