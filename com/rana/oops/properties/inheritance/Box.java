package com.rana.oops.properties.inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }
    //cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    //copy constructor
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void information(){
        System.out.println("hello the box is up");
    }
}
