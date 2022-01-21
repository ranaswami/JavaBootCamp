package com.rana.strings;
//https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;
public class IsValid {

    public static void main(String[] args) {
        String s = "[(()]";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s) {
        if (s.length() % 2 != 0){//this is really a very smart check
            return false;//if the length is not divisible by 2, how can it have one opening and closing braces
        }
        Stack<Character> st = new Stack<>();//stack data structure is used to check opening and closing braces
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '['){
                st.push(ch);//push the 1st character into the stack if it fulfills the criteria
            }
            else {
                if (st.isEmpty()) return false;//if the 1st character is a closing braces, stack will have nothing
                //and function will return false
                char c = st.pop();//pop out the top element
                if ((ch == ')' && c == '(') ||
                    (ch == '}' && c == '{') || (ch == ']' && c == '[')){
                    continue;//check it will the next character and if it fulfills the criteria, you can continue
                }
                else return false;//if the next braces was a different one
            }
        }
        return (st.isEmpty());//or just return false
        // because the stack will be having character/characters if they don't have closing braces
    }
}
