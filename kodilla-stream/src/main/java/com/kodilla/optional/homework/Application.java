package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Teacher t1 = new Teacher("Severus Snipe");
        Teacher t2 = new Teacher ("Prof Dumbledore");
        Teacher t3 = new Teacher("Pawel Pluta");
        Student s1 = new Student("Harry Potter", t1);
        Student s2 = new Student("Ron Wesley", t1);
        Student s3 = new Student("Hermiona Gringer", t2);
        Student s4 = new Student("Krzysztof Jarzyna", null);
        Student s5 = new Student("Michał Leonowicz", t3);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        // i tu zaczynaja sie problemy..

        Optional<Teacher> optionalTeacher = Optional.of(t1);

        String undefinedTeacher = optionalTeacher.orElse("<undefined>");



                .stream() //nie umiem "zapoczątkować streama" zeby zrobić pętlę for each
                .map(Student::getNameAndTeacher)
                .forEach(un -> System.out.println(un))


    }
}
