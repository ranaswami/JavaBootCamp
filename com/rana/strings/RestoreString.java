package com.rana.strings;

public class RestoreString {

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s,indices));
    }
    static String restoreString(String s, int[] indices) {

        StringBuilder b = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < indices.length; j++) {
                if (indices[j] == i)
                    b.append(s.charAt(j));
            }
        }

        return b.toString();
    }
}
