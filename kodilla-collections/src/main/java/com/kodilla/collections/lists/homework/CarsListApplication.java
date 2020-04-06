package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Honda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Car> models = new LinkedList<>();

        Honda accord = new Honda(95);
        models.add(accord);
        Honda civic = new Honda(140);
        models.add(civic);
        Honda cr_v = new Honda(130);
        models.add(cr_v);

        for(Car model: models)
        {
            CarUtils.describeCar(model);
        }
        models.remove(0);

        for(Car model: models)
        {
            CarUtils.describeCar(model);
        }
        models.remove(cr_v);

        for(Car model: models)
        {
            CarUtils.describeCar(model);

            System.out.println("Wielkość kolekcji models to: " + models.size() + " sztuk/a. " );
        }
    }
}

