package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    static LocalDate yesterday = LocalDate.of(2020, 9, 22);
    public static List<Task> listOfTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Przygotowanie oferty", yesterday, LocalDate.now()));
        tasks.add(new Task("Wysłanie wniosku", yesterday, LocalDate.of(2020,9,28)));
        tasks.add(new Task ("Zatrudnienie pracownika", yesterday, LocalDate.of(2020,9,28)));
        tasks.add(new Task("Przeszkolenie załogi", yesterday, LocalDate.of(2020,9,30)));
        tasks.add(new Task("Uruchomienie sprzedaży", yesterday, LocalDate.of(2020,10,5)));
        return tasks;


    }
}
