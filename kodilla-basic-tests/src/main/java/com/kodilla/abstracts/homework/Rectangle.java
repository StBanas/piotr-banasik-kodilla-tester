package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle(int wymiar1, int wymiar2)
    {
        super(13, 2);
    }
    @Override
    public int area() {
        int area = (getWymiar1() * getWymiar2());
        return area;
    }
    @Override
    public int perimiter() {
            int perimiter = 2 * getWymiar1() + 2 * getWymiar2();
            return perimiter;
    }

}
