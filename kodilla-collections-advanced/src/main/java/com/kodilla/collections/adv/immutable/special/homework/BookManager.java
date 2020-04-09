package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager extends Book {

    List<Book> books = new ArrayList<>();

    public BookManager(String title, String author) {
        super(title, author);
    }

    public Book createBook(String title, String author) {

        for (Book book : books) {

            for (int i = 0; i < books.size(); i++) {

                if  (book.equals(books.get(i))) { return ((Book)books.remove(i)); }
                else { return new Book(title, author); }
            }
        }
        return new Book(title, author);
    }
}