package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directory = new HashMap<>();

        Principal kazimierz = new Principal("Kazimierz", "Szcześniak");
        Principal bogdan = new Principal("Bogdan", "Szczypka");
        Principal genowefa = new Principal("Genowefa", "Nowak");
        Principal bozena = new Principal("Bożena", "Dekiel");

        School lo1 = new School();
        School lo2 = new School();
        School lo3 = new School();
        School lo4 = new School();

        directory.put(kazimierz, lo1);
        directory.put(genowefa, lo2);
        directory.put(bogdan, lo3);
        directory.put(bozena, lo4);

        for (Map.Entry<Principal, School> schoolEntry : directory.entrySet())
            System.out.println();

    }
}
