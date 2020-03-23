package com.kodilla.inheritance.homework;

public class OS_At_Work {

    public static void main(String[] args) {

        Windows windows0 =  new Windows(1985);
        windows0.turnOn();

        /* Nie działa getEditionYear !!! */
//        windows0.getEditionYear();

        Linux ubuntu = new Linux(2001);
        ubuntu.turnOff();
//        ubuntu.getEditionYear();
     }

}