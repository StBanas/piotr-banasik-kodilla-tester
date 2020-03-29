package com.kodilla.inheritance.homework;

public abstract class OperatingSystem {

    private int editionYear;

        public OperatingSystem(int editionYear)
            {
                this.editionYear = editionYear;
            }
    public abstract void turnOn();

    public abstract void turnOff();

    public int getEditionYear()
    {
        return editionYear;
    }
}