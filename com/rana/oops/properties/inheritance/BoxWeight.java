package com.rana.oops.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){//constructor

        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }//this is similar to Box b3 = new BoxWeight(2,3,4,8);


    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);//what is this? call the parent class constructor
        //used to initialize values of parent class
        this.weight = weight;
    }
}
