package com.rana.oops;

public class WrapperExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        Integer num1 = 4;
        Integer num2 = 6;// new Integer(4);

        swap(a, b);
        System.out.println(a+" "+b);//it doesn't swap because java is pass by value not pass by reference

        swap1(num1, num2);
        System.out.println(num1+" "+num2);//here it doesn't swap because Integer class is final

    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap1(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}
