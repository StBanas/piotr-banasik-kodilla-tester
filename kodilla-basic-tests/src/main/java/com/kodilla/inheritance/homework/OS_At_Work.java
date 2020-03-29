package com.kodilla.inheritance.homework;

public class OS_At_Work {

    public static void main(String[] args) {

        Windows windows = new Windows(1985);
        Linux ubuntu = new Linux(2001);

        windows.turnOn();
        ubuntu.turnOff();

//        System.out.println("Rok edycji Linuxa:  " +  ubuntu.getEditionYear());
//        System.out.println("Rok edycji Windowsa:  " +  windows.getEditionYear());

//        windows.turnOff();
//        ubuntu.turnOn();
//
//        System.out.println("Rok edycji Linuxa:  " +  ubuntu.getEditionYear());
//        System.out.println("Rok edycji Winowsa:  " +  windows.getEditionYear());

    }

}