package com.rana.oops.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(44, "Rana"));
        students.add(new Student(47, "Riya"));
        students.add(new Student(72, "Raman"));
        students.add(new Student(23, "Ravi"));
        students.add(new Student(88, "Aakash"));
        students.add(new Student(88, "Rupesh"));

        //Collections.sort(students);

        //Collections.sort(students, new SortByNameThenMarks());

        /**
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.name.equals(o2.name)){
                    return o2.marks - o1.marks;
                } else {
                    return o1.name.compareTo(o2.name);
                }
            }
        });
         */

        //using lambda
        Collections.sort(students, ((o1, o2) -> {
            if (o1.name.equals(o2.name)){
                return o2.marks - o1.marks;
            } else {
                return o1.name.compareTo(o2.name);
            }
        }));



        students.forEach(System.out::println);

    }
}
/**
class SortByNameThenMarks implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.name.equals(o2.name)){
            return o2.marks - o1.marks;
        } else {
            return o1.name.compareTo(o2.name);
        }
    }
}
 */
