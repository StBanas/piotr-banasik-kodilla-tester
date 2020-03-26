package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square(int dimension1, int dimension2)
    {
        super(1, 1);
    }

    @Override
    public int area() {
        int area = (getDimension1() * getDimension2());
            return area;
        }
    @Override
    public int perimiter()  {
        int perimiter = 4 * getDimension1();
            return perimiter;

    }


}
