package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {



        Square square = new Square(2,2);  // Ale dlaczego mi nadpisuje super? skoro te dane są późniejsze?
        System.out.println( "Obwód kwadratu o boku " + square.getDimension1() + " jednostki wynosi: " + square.perimiter() + " jednostek.");
        System.out.println("Powierzchnia takiego kwadratu wynosi : " + square.area() + " jednostek kwadratowych.");

        Triangle triangle = new Triangle(4, 5);
        System.out.println("Obwód trójkąta prostokątnego o bokach : "  + triangle.getDimension1() + " jednostek i " + triangle.getDimension2() +  " jednostek  wynosi: " + triangle.perimiter() + " jednostek." );
        System.out.println("Powierzchnia takiego trójkąta wynosi : " + triangle.area() + " jednostek kwadratowych.");

        Rectangle rectangle = new Rectangle(0, 0);
        System.out.println("Obwód prostokąta o bokach : "  + rectangle.getDimension1() + " jednostek i " + rectangle.getDimension2() +  " jednostek  wynosi: "+ rectangle.perimiter() + " jednostek." );
        System.out.println("Powierzchnia takiego prostokąta wynosi : " + rectangle.area() + " jednostek kwadratowych.");

    }
}
