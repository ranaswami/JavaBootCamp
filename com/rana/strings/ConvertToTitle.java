package com.rana.strings;

public class ConvertToTitle {

    public static void main(String[] args) {
        int columnNumber = 1;
        int columnNumber1 = 702;

        System.out.println(convertToTitle(columnNumber));
        System.out.println(convertToTitle(columnNumber1));

    }
    static String convertToTitle(int columnNumber) {
        StringBuilder b = new StringBuilder();

        while (columnNumber > 0){
            char ch = (char) ((int) 'A' + (columnNumber - 1) % 26);
            columnNumber = (columnNumber - 1) / 26;
            b.append(ch);
        }
        b.reverse();
        return b.toString();
    }
}
