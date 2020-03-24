package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    String job;
    int age;

    public Person (String firstName,  String job, int age){

        this.firstName = firstName;
        this.job = job;
        this.age = age;

    }
    public String getfirstName() {
        return firstName;
    }

    public String getJob() {
        return job;
    }
    public int getJage() {
        return age;
    }
}
