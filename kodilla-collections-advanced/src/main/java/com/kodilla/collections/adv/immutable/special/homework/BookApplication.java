package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    @Override
    public String toString() {
        return "BookApplication{}";
    }

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book(" Przeprawa ", " Cormac MacCarthy");

        books.add(book1);
        System.out.println(book1);

        Book book2 = new Book(" Krwawy Południk", " Cormac MacCarthy");
        books.add(book2);
        System.out.println(book2);

        Book book3 = new Book(" Droga ", " Cormac MacCarthy");
        books.add(book3);
        System.out.println(book3);

        Book book11 = new Book(" Przeprawa ", " Cormac MacCarthy");
        books.add(book11);
        System.out.println(book11);
        System.out.println("======================");
        System.out.println(books.size());

        System.out.println(book1.equals(book2));
        System.out.println(book1 == book2);

        System.out.println(book1.equals(book11));
        System.out.println(book1 == book11);
    }
}
