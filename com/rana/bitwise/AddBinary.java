package com.rana.bitwise;
//https://leetcode.com/problems/add-binary/
public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
    }
    static String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int carry=0,i=a.length()-1,j=b.length()-1;

        while(i>=0 || j>=0 || carry==1){

            if(i>=0){
                carry+=a.charAt(i)-'0';
            }
            if(j>=0){
                carry+=b.charAt(j)-'0';
            }
            char ch = (char)(carry%2+'0'); //if there is carry ? then add 1
            str.append(ch);
            carry/=2; // carry forwarding extras
            i--;
            j--;
        }

        return str.reverse().toString();
    }
}
