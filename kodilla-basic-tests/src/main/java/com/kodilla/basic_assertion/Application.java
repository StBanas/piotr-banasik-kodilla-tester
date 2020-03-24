package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {


        Calculator calc = new Calculator();
        double x = 2.5;
        double y = 1.3;

        System.out.println("wynik dodawania to: " + calc.adding(2.5,3.8));
//        System.out.println("wynik odejmowania to: " + calc.substracting(2.5,1.3));
        System.out.println("wynik podnoszenia do kwadratu to: " + calc.powering(2.5));

        boolean correct = ResultChecker.assertEquals(6.3, calc.adding(2.5,3.8) );
        if (correct) {
            System.out.println("Metoda adding działa poprawnie dla liczb " + x + " i " + y);
        }

         boolean correct1 = ResultChecker.assertEquals(6.25, calc.powering(2.5) );
        if (correct1) {
            System.out.println("Metoda powering działa poprawnie dla liczby " + x );
        }
    }
}
