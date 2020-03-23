package com.kodilla.abstracts.homework;

public class Developer extends Job
    {
    public Developer(int salary, String responsibilities) {
        super(salary, responsibilities);
    }
    public void displaySalary(){
        System.out.println("Wynagrodzenie wynosi: " + getSalary());
    }
    public void displayResponsibilities(){
        System.out.println("Scope of duties:  " + getResponsibilities());
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
