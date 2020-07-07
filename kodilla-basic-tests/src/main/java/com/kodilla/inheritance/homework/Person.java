package com.kodilla.inheritance.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job){

        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public void displayInfo(){
        System.out.println("I am " + firstName + ", " + age + " years old. My main responsibility is ");
        System.out.println(job.getResponsibilites());
    }

    public static void main(String[] args) {
        Person person = new Person("JohnMalkovich", 55, new Surgeon());
        person.displayInfo();

        Person person1 = new Person("PaulMcKenney", 62,  new Janitor());
        person1.displayInfo();

        Person person2 = new Person("DavidDuhovny", 39, new Driver());
        person2.displayInfo();
    }
}
