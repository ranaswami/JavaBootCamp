package com.rana.oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box b = new Box(4);

        System.out.println(b.l+" "+b.w+" "+b.h);

        BoxWeight b1 = new BoxWeight();
        BoxWeight b2 = new BoxWeight(2,3,4,5);
        System.out.println(b1.h+" "+b1.weight);
        System.out.println(b2.weight);

        Box b3 = new BoxWeight(2,3,4,8);
        System.out.println(b3.w);
    }
}
