package com.kodilla.abstracts.homework;

public class Manager extends Job {

    public Manager(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public String firstName() {
        return null;
    }

    @Override
    public String job() {
        return null;
    }
}
