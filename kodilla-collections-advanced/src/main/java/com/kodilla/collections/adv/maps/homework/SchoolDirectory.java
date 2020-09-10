package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directory = new HashMap<>();

        Principal kazimierz = new Principal("Kazimierz", "Szcześniak");
        Principal bogdan = new Principal("Bogdan", "Szczypka");
        Principal genowefa = new Principal("Genowefa", "Nowak");
        Principal bozena = new Principal("Bożena", "Dekiel");

        School lo1 = new School("Liceum ogólnokształcące nr1");
        School lo2 = new School("Liceum ogólnokształcące nr2");
        School lo3 = new School("Liceum ogólnokształcące nr3");
        School lo4 = new School("Liceum ogólnokształcące nr4");

        lo1.addStudent(30);
        lo1.addStudent(20);
        lo1.addStudent(25);
        lo1.addStudent(31);
        lo1.addStudent(30);

        lo2.addStudent(22);
        lo2.addStudent(24);
        lo2.addStudent(26);
        lo2.addStudent(27);

        lo3.addStudent(30);
        lo3.addStudent(34);
        lo3.addStudent(36);

        lo4.addStudent(33);
        lo4.addStudent(23);
        lo4.addStudent(30);
        lo4.addStudent(31);

        directory.put(kazimierz, lo1);
        directory.put(genowefa, lo2);
        directory.put(bogdan, lo3);
        directory.put(bozena, lo4);

        for (Map.Entry<Principal, School> schoolEntry : directory.entrySet())
            System.out.println(schoolEntry.getKey() + " director of " + schoolEntry.getValue() + " where attends " + schoolEntry.getValue().sumOfStudents() + " students.");

    }
}
