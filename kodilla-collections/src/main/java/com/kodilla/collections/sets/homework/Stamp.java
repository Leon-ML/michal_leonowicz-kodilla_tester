package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double sideA;
    private double sideB;
    private boolean ifStamped;
    private double size;

    public double getStampSize (double sideA, double sideB){
        return size = sideA*sideB;
    }

    public Stamp(String name, double sideA, double sideB, boolean ifStamped) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.ifStamped = ifStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamps = (Stamp) o;
        return Double.compare(stamps.sideA, sideA) == 0 &&
                Double.compare(stamps.sideB, sideB) == 0 &&
                ifStamped == stamps.ifStamped &&
                Double.compare(stamps.size, size) == 0 &&
                Objects.equals(name, stamps.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sideA, sideB, ifStamped, size);
    }

    @Override
    public String toString() {
        return "Stamps{" +
                "name='" + name + '\'' +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", ifStamped=" + ifStamped +
                ", size=" + size +
                '}';
    }
}
