package com.kodilla.soap.library;

import com.kodilla.courses.soap.Book;
import com.kodilla.courses.soap.Technology;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class Books {
    private static final Map<String, Book> booksList = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book robot = new Book();
        robot.setISBN("1000");
        robot.setTitle("Robot");
        robot.setAuthor("Snerg-Wisniewski");
        robot.setPublicationYear(1978);
        robot.setLiteratureGener(Technology.SCI_FI);

        booksList.put(robot.getISBN(), robot);

        Book wzorce = new Book();
        wzorce.setISBN("1001");
        wzorce.setTitle("Wzorce Projektowe");
        wzorce.setAuthor("Gamma, Helm");
        wzorce.setPublicationYear(2010);
        wzorce.setLiteratureGener(Technology.TECH);

        booksList.put(wzorce.getISBN(), wzorce);

        Book katar = new Book();
        katar.setISBN("1002");
        katar.setTitle("Katar");
        katar.setAuthor("Stanislaw LemKatar");
        katar.setPublicationYear(1966);
        katar.setLiteratureGener(Technology.CRIME);

        booksList.put(katar.getISBN(), katar);
    }

    public Book findBook(String ISBN) {
        Assert.notNull(ISBN, "You have to specify the book's ISBN");
        return booksList.get(ISBN);
    }
}
