package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Toyota verso = new Toyota(0);
        Mitsubishi colt = new Mitsubishi(0);
        Honda accord = new Honda(0);

        doRace (colt);
        doRace(verso);
        doRace(accord);

        showRaceDetails(verso);
        showRaceDetails(accord);
        showRaceDetails(colt);
    }

    public static void showRaceDetails(Car car)
    {
        System.out.println(car.getSpeed());
    }

    public static void doRace (Car car)
    {
        for (int i = 1; i < 3; i++)
        {
            car.increaseSpeed();
        }
        for (int i = 1; i < 2; i++)
        {
            car.decreaseSpeed();
        }
    }
}
