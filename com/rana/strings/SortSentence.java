package com.rana.strings;
//https://leetcode.com/problems/sorting-the-sentence/

public class SortSentence {

    public static void main(String[] args) {

        String s = "is2 sentence4 This1 a3";
        //System.out.println(Integer.parseInt("1"));
        System.out.println((sortSentence(s)));

    }
    static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        StringBuilder b = new StringBuilder();
        
        int i = 0;
        for (String elem: str) {
            //i = (int) (elem.charAt(elem.length() - 1) - '0');
            //i = Character.getNumericValue(elem.charAt(elem.length() - 1));
            i = Integer.parseInt(String.valueOf(elem.charAt(elem.length() - 1)));

            // all the above three methods are correct in order to convert an char into an integer
            res[i - 1] = elem.substring(0, elem.length() - 1);
        }
        int j = 0;
        for (j = 0; j < res.length - 1; j++) {
            b.append(res[j]).append(" ");
        }
        b.append(res[j]);
        return b.toString();
    }
}
