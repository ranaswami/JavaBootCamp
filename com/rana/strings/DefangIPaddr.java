package com.rana.strings;

public class DefangIPaddr {

    public static void main(String[] args) {

        String address = "1.1.1.10";

        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
//        String mod = "";
//        for (int i = 0; i < address.length(); i++) {
//            if (address.substring(i,i+1).equals("."))
//                mod = mod + "[.]";
//            else
//                mod = mod + address.substring(i,i+1);
//        }
//        return mod;

        //the above code snippet is also correct.

        StringBuilder b = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            if (address.substring(i,i+1).equals("."))
                b.append("[.]");
            else
                b.append(address.substring(i,i+1));
        }
        return b.toString();
    }
}
