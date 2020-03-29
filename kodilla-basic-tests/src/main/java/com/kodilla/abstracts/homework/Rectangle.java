package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle(int dimension1, int dimension2)
    {
        super(13, 2);
    }
    @Override
    public int area() {
        int area = (getDimension1() * getDimension2());  // wiem, że area jest nadmiarowa etc... w innych figurach to samo
        return area;
    }
    @Override
    public int perimiter() {
            int perimiter = 2 * getDimension1() + 2 * getDimension2();
            return perimiter;
    }

}
