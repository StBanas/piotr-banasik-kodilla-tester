package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int editionYear) {
        super(editionYear);
        System.out.println("Linux constructor");
    }
    public void turnOn(){
        System.out.println("System turned on");
    }

    public void turnOff(){
        System.out.println("System turned off");
    }

    public int getEditionYear(int editionYear) {
        return editionYear;
    }
}