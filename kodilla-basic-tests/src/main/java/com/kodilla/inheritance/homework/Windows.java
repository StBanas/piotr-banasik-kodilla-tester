package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    private int editionYear;

    public Windows(int editionYear) {
//        {this.editionYear = editionYear;}
        super(editionYear);
        System.out.println("Windows constructor");
    }

    public void turnOn(){
        System.out.println("System turned on");
    }

    public void turnOff(){
        System.out.println("System turned off");
    }

    public void displayEditionYear() {
        System.out.println("Edition year :  ");
    }
    /*
    Metoda " getEditionYear nie zwraca mi wartości - nie mogę tego rozwiązać !!!
     */
//    @Override
//    public int getEditionYear(int editionYear) {
//        return editionYear;
//    }
}
