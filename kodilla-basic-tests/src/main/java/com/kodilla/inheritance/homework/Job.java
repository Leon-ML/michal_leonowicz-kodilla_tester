package com.kodilla.inheritance.homework;

public abstract class Job {

    private int salary;
    private String responsibilites;

    public Job(int salary, String responsibilites){
        this.salary = salary;
        this.responsibilites = responsibilites;

    }

    public String getResponsibilites(){
        return responsibilites;
    }

    public int getSalary(){
        return salary;
    }

}
