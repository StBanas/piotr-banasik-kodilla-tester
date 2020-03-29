package com.kodilla.inheritance.homework;

public abstract class OperatingSystem {

    private int editionYear;

        public OperatingSystem(int editionYear)
            {
                this.editionYear = editionYear;
            }
    public void turnOn()
    {
        System.out.println("System turned on");
    }

    public void turnOff()
    {
        System.out.println("System turned off");
    }

    public int getEditionYear()
    {
        return editionYear;
    }
}