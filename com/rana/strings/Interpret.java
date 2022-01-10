package com.rana.strings;
//https://leetcode.com/problems/goal-parser-interpretation/submissions/
public class Interpret {

    public static void main(String[] args) {

        String commmand = "G()(al)";

        System.out.println(interpret(commmand));

    }
    static String interpret(String command) {
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '(' && command.charAt(i+1) == ')')
                b.append("o");
            else if (command.charAt(i) == '(' && command.charAt(i+3) == ')')
                b.append("al");
            else if (command.charAt(i) == 'G')
                b.append("G");
        }
        return b.toString();
    }
}
