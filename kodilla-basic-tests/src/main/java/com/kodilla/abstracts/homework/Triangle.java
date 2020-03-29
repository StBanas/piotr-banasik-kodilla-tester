package com.kodilla.abstracts.homework;

import static java.lang.StrictMath.sqrt;

public class Triangle extends Shape {

    public Triangle(int dimension1, int dimension2) // right-angle triangle
    {
        super(3, 4);
    }

    @Override
    public int area() {
        int area = (getDimension2()/2 * getDimension1());
        return area;
    }
    @Override
    public int perimiter()
    {
            return (int) sqrt(((getDimension1() * getDimension1()) + (getDimension2() * getDimension2()))) + getDimension1() + getDimension2();
    }


}
