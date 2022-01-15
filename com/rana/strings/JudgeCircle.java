package com.rana.strings;
//https://leetcode.com/problems/robot-return-to-origin/
public class JudgeCircle {
    public static void main(String[] args) {
        String moves = "UD";

        System.out.println(judgeCircle(moves));
    }
    static boolean judgeCircle(String moves) {
        int v = 0, h = 0;

        for (char move : moves.toCharArray()) {
            switch (move){
                case ('U'): {
                    v++;
                    break;
                }
                case ('D'): {
                    v--;
                    break;
                }
                case ('R'): {
                    h++;
                    break;
                }
                case ('L'): {
                    h--;
                    break;
                }
            }
        }
        if (v == 0 && h == 0)
            return true;
        return false;
    }
}
