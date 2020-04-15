package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    List<Book> books = new ArrayList<>();

    public Book createBook(String title, String author)
    {
        Book item = new Book(title, author);
        checkUniquness(item);
        return new Book(title, author);
    }
    private void checkUniquness(Book item) {
        for (Book newBook: books)
            if( newBook.equals(item)) {
            System.out.println("This book : " + newBook.getTitle() + " is already inserted into the collection.");
            break;
        }
        books.add(item);
    }

    public List<Book> getList() {
        return books;
    }
    
}
