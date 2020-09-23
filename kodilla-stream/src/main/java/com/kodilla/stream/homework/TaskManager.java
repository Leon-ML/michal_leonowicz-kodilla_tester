package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> dates = TaskRepository.listOfTasks()
                .stream()
                .filter(task -> task.getDeadline().isAfter(LocalDate.now()))
                .map(task -> task.getDeadline())
                .collect(Collectors.toList());

        System.out.println(dates);

    }
}
