package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Mitsubishi;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println(" ------------------------------------  ");
        System.out.println("Car model: " + getCarName(car));
        System.out.println("Current Velocity   : " + car.getSpeed());
    }
    private static String getCarName(Car car) {
        if (car instanceof Honda) {
            return " Honda Accord";
        } else if (car instanceof Toyota) {
            return "Toyota Verso";
        } else if (car instanceof Mitsubishi) {
            return "Mitsubishi Colt";
        }
        else {return "Unknown Car name";}
    }
}
