package com.rana.recursion;
//asked in EPAM exam
public class Epam {
    public static void main(String[] args) {
        String s = "java2code3";
        int k = 10;
        System.out.println(solution(s, k));
    }
    static String solution(String s, int k){
        char[] ch = s.toCharArray();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i]) == false){
                str.append(ch[i]);
            } else {
                String s1 = str.toString();
                for (int j = 0; j < (ch[i] - '0') - 1 ; j++) {
                    str.append(s1);
                }
            }
        }
        System.out.println(str.toString());
        char c = str.toString().charAt(k-1);
        return Character.toString(c);
    }
}
