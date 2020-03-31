package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Mitsubishi;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {

        Random random = new Random();
        Car[] cars = new Car[random.nextInt(14) + 1];
        for (int n = 0; n < cars.length; n++)
        {
            cars[n] = drawCar();
        }
        for (Car car : cars)
        {
            CarUtils.describeCar(car);
        }
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnModelCar = random.nextInt(3);
//        double getSpeed = random.nextInt(20);

        if (drawnModelCar == 0) {
            Random random1 = new Random();
            return new Toyota(random1.nextInt(15));
        } else if (drawnModelCar == 1) {
            Random random1 = new Random();
            return new Honda(random1.nextInt(15));
        } else {
            Random random1 = new Random();
            return new Mitsubishi(random1.nextInt(15));
        }
    }


}
