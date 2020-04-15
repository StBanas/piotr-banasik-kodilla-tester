package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookApplication {

    public static void main(String[] args) {

        Map<String, String> booksCollection = new HashMap<>();

        BookManager booksmanager = new BookManager();
        System.out.println(booksCollection);

        Book book1 = booksmanager.createBook("Przeprawa ", " Cormac MacCarthy");
        booksCollection.put(book1.getTitle(), book1.getAuthor());
        System.out.println(book1);

        Book book2 = booksmanager.createBook("Droga ", " Cormac MacCarthy");
        booksCollection.put(book2.getTitle(), book2.getAuthor());
        System.out.println(book2);

        Book book3 = booksmanager.createBook("Droga ", " Cormac MacCarthy");
        booksCollection.put(book3.getTitle(), book3.getAuthor());    /* nie wchodzi do mapy mimo próby ".put"
                                                            ale w liście się znajduje */


        System.out.println("============================");
        System.out.println( "List of books: " + booksCollection);
        System.out.println( "Number of books : " + booksCollection.size());
        System.out.println("============================");

        for (Book book: booksmanager.getList()){
            System.out.println(book);

//        for (Map.Entry(Book , Book ) book: books.entrySet() {
//            System.out.println(book);



        }
    }
}


