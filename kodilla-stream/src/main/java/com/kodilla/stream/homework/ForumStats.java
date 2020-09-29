package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats<avgUnder40> {
    public static void main(String[] args) {
        double avgOver40 = UserRepository.getUsersList()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(n -> n)
                .filter(un -> (un >= 40))
                .average()
                .getAsDouble();
        System.out.println("ŚREDNIA LICZBA POSTÓW OSOBY 40LETNIEJ I STARSZYCH TO: " + avgOver40);

        double avgUnder40 = UserRepository.getUsersList()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(n -> n)
                .filter(un -> (un < 40))
                .average()
                .getAsDouble();
        System.out.println("ŚREDNIA LICZBA POSTÓW OSOBY PONIŻEJ 40 ROKU ŻYCIA TO: " + avgUnder40);
    }
}
