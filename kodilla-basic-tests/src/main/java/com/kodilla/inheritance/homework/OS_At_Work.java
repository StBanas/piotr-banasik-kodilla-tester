package com.kodilla.inheritance.homework;

public class OS_At_Work {

    public static void main(String[] args) {

//        System.out.println(windows0.getEditionYear());

        Windows windows0 = new Windows(1985) {
            @Override
            public void getEditionYear() {

            }
        };
        windows0.turnOn();

        /* Nie działa getEditionYear !!! */


        Linux ubuntu = new Linux(2001) {

            @Override
            public void getEditionYear() {

            }
        };
        ubuntu.turnOff();
        ubuntu.getEditionYear();
     }

}