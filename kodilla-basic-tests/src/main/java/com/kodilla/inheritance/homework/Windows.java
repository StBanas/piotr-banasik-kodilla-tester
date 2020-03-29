package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int editionYear)
    {
        super(editionYear);
//        System.out.println("Windows constructor ");
    }

    @Override
    public void turnOn()
    {
        System.out.println("Windows turned 'ON' . Rok wydania to :  " + getEditionYear());
    }

    @Override
    public void turnOff()
    {
        System.out.println("Windows turned 'OFF' . Rok wydania to:  " + getEditionYear());
    }

}
