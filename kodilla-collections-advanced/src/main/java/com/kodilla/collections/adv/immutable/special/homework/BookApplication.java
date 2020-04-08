package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {

        List<BookManager> books = new ArrayList<>();

        BookManager book1 = new BookManager (" Przeprawa ", " Cormac MacCarthy");

        book1.createBook(" Przeprawa ", " Cormac MacCarthy");
        books.add(book1);
        System.out.println(book1);

        BookManager book2 = new BookManager ("  Droga ", " Cormac MacCarthy");
//        book2.createBook("  Droga ", " Cormac MacCarthy");
        books.add(book2);
        System.out.println(book2);

        BookManager book3 = new BookManager (" Krwawy Południk ", " Cormac MacCarthy");
//        book3.createBook(" Krwawy Południk ", " Cormac MacCarthy");
        books.add(book3);
        System.out.println(book3);

        BookManager book11 = new BookManager (" Krwawy Południk ", " Cormac MacCarthy");
        book11.createBook(" Krwawy Południk ", " Cormac MacCarthy");
        books.add(book11);
        System.out.println(book11);

        System.out.println(books.size());

//        Book book4 = new BookManager(" Sutree ", " Cormac MacCarthy");
//        Book book5 = new BookManager(" Dziecię Boże ", " Cormac MacCarthy");
//        Book book6 = new BookManager(" Strażnik Sadu ", " Cormac MacCarthy");
//        Book book7 = new BookManager(" Rącze Konie ", " Cormac MacCarthy");
//        Book book8 = new BookManager(" To nie jest kraj dla starszych ludzi ", " Cormac MacCarthy");
//        Book book9 = new BookManager(" Sodoma i Gomora ", "C ormac MacCarthy");
//        Book book10 = new BookManager(" W ciemność ", " Cormac MacCarthy");

        System.out.println(book1.equals(book2));
        System.out.println (book1 == book2);

        System.out.println(book3.equals(book11));
        System.out.println (book3 == book11);
    }
}
