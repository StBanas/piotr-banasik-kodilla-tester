package com.kodilla.basic_assertion;

public class Calculator {
    double x;
    double y;

    public Calculator(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double add(double x, double y)
    {
        return x + y;
    }

    public double power(double x)
    {
        return x * x;
    }
}
