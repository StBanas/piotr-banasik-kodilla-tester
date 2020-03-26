package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle(int dimension1, int dimension2)
    {
        super(5, 4);
    }

    @Override
    public int area() {
        int area = (getDimension1()/2 * getDimension2());
        return area;
    }
    @Override
    public int perimiter() {
        if (getDimension1() > getDimension2())
        {
            int perimiter = 3 * getDimension1();
            return perimiter;
        }
       else {
            int perimiter = 3 * getDimension2();
            return perimiter;
        }
    }


}
