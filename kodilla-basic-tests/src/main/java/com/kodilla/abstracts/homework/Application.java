package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Square square = new Square(1,1);
        System.out.println(square.perimiter());
        System.out.println(square.area());

        Triangle triangle = new Triangle(5, 2);
        System.out.println(triangle.perimiter());
        System.out.println(triangle.area());

        Rectangle rectangle = new Rectangle(12, 5);
        System.out.println(rectangle.perimiter());
        System.out.println(rectangle.area());

    }
}
