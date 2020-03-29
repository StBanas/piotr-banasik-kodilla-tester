package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        double x = 2.5;
        double y = 3.8;
        Calculator calc = new Calculator(2.5, 3.8);


        System.out.println("wynik dodawania to: " + calc.add(2.5,3.8));
        System.out.println("wynik podnoszenia do kwadratu to: " + calc.power(2.5));

        boolean assertAddCorrect = ResultChecker.assertEquals(6.3, calc.add(2.5,3.8) );
        if (assertAddCorrect)
        {
            System.out.println("Metoda add działa poprawnie dla liczb " + x + " i " + y);
        }

        boolean assertPowerCorrect = ResultChecker.assertEquals(6.25, calc.power(2.5) );
        if (assertPowerCorrect)
        {
            System.out.println("Metoda power działa poprawnie dla liczby " + x );
        }
    }
}
