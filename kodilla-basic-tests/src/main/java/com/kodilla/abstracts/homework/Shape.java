package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int dimension1;
    private int dimension2;

    public Shape(int dimension1, int dimension2)
    {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public int getDimension1()
    {
        return dimension1;
    }

    public int getDimension2()
    {
        return dimension2;
    }

    public abstract int area();

    public abstract int perimiter();
}
