package com.rana.oops;

public class Student {
    public static void main(String[] args) {
        StudentObject rana = new StudentObject(10, "Rana Swami", 82.5f);

        StudentObject random = new StudentObject(rana);

        System.out.println(random.name);

        StudentObject random1 = new StudentObject();

        System.out.println(random1.name);

        //System.out.println(rana.name);
        //System.out.println(rana.marks);
    }
    static class StudentObject{
        int rollNo;
        String name;
        float marks;

        StudentObject (StudentObject other){
            this.rollNo = other.rollNo;
            this.name = other.name;
            this.marks = other.marks;
        }

        StudentObject(){
            // this is how we call a constructor from another constructor
            // internally: new student (0, "default person", 0.0f);
            this (0, "default person", 0.0f);
        }

         StudentObject (int rollNo, String name, float marks){
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }
    }
}
