package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Bocian", 4.0, 5.0, true));
        stamps.add(new Stamp("Kaczka", 4.0,5.0, true));
        stamps.add(new Stamp("Słoneczniki", 3.0, 2.0, false));
        stamps.add(new Stamp("Adam Małysz", 4.0,4.0, true));
        stamps.add(new Stamp("Orzełek", 4.0,5.0, false));
        stamps.add(new Stamp("Bocian", 4.0, 5.0, true));
        stamps.add(new Stamp("Kaczka", 4.0,5.0, true));
        System.out.println(stamps.size());
            for (Stamp stamp : stamps)
                System.out.println(stamp);
    }
}
