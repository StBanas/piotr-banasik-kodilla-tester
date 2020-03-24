package com.kodilla.abstracts.homework;

public class Tester extends Job
    {
    public Tester(int salary, String responsibilities) {
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
