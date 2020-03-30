package com.kodilla.collections.interfaces.homework;

public class Mitsubishi implements Car{
    int speed;

    public Mitsubishi(int speed)
    {
        this.speed = speed;
    }

    @Override
    public int getSpeed()
    {
        return this.speed;
    }

    @Override
    public void increaseSpeed()
    {
        this.speed = this.speed +13;
    }

    @Override
    public void decreaseSpeed()
    {
        this.speed = this.speed -10;
    }
}
