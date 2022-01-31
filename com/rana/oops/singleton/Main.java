package com.rana.oops.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj1 = Singleton.getInstance();

        Singleton onj2 = Singleton.getInstance();
    }

}
