package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }



    private List<Integer> numberOfStudents = new ArrayList<>();

    public void addStudent(int classCapacity) {
        numberOfStudents.add(classCapacity);
    }



    public int sumOfStudents() {
        int sum = 0;
        for (int capacity : numberOfStudents)
            sum += capacity;
        return sum;

    }

    @Override
    public String toString() {
        return  schoolName ;
    }
}
