package com.kodilla.inheritance.homework;

public class Person extends Job {
    private String firstName;
    private int age;
    private String job;

    public Person(String firstName, int age, String job){
        super(int Salary, String job);
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Person person = new Person("JohnMalkovich", 55, "Surgeon");
        System.out.println("John is a surgeon, his main responsibility is: ");

        Person person1 = new Person("PaulMcKenney", 62, "Janitor");
        System.out.println("Paul is a janitor, his main responsibility is: ");

        Person person2 = new Person("DavidDuhovny", 39, "Driver");
        System.out.println("David is a driver, his main responsibility is: ");
    }
}
