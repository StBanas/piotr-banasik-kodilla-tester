package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int editionYear)
    {
        super(editionYear);
        System.out.println("Linux constructor");
    }

    @Override
    public void turnOn()
    {
        System.out.println("Linux turned on. Rok wydania to:  " + getEditionYear());
    }

    @Override
    public void turnOff()
    {
        System.out.println("Linux turned off. Rok wydania to:  " + getEditionYear());
    }

}
