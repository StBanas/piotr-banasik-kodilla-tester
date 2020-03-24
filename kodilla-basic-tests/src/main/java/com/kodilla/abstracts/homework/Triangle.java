package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle(int wymiar1, int wymiar2)
    {
        super(5, 4);
    }

    @Override
    public int area() {
        int area = (getWymiar1()/2 * getWymiar1());
        return area;
    }
    @Override
    public int perimiter() {
        if (getWymiar1() > getWymiar2())
        {
            int perimiter = 3 * getWymiar1();
            return perimiter;
        }
       else {
            int perimiter = 3 * getWymiar2();
            return perimiter;
        }
    }


}
