package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square(int wymiar1, int wymiar2)
    {
        super(1, 1);
    }

    @Override
    public int area() {
        int area = (getWymiar1() * getWymiar1());
            return area;
        }
    @Override
    public int perimiter()  {
        int perimiter = 4 * getWymiar1();
            return perimiter;

    }


}
