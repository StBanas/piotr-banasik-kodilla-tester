package com.kodilla.collections.interfaces.homework;

public class Honda implements Car{
    int speed;
    String model;

    @Override
    public String toString() {
        return "Honda{" +
                "speed=" + speed +
                '}';
    }

    public Honda (int speed)
    {
        this.speed = speed;
    }

    @Override
    public int getSpeed()
    {
        return speed;
    }

    @Override
    public void increaseSpeed()
    {
        this.speed = this.speed +14;
    }

    @Override
    public void decreaseSpeed()
    {
        this.speed = this.speed -10;
    }

}
