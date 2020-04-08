package com.kodilla.collections.adv.immutable.special.homework;

public class BookManager {
    private String title;
    private String author;

    public BookManager(String title, String author) {
        this.title = title;
        this.author = author;
    }
//    private List<Book> books = new ArrayList<>();
//
//    public BookManager(String title, String author, Book... books) {
//        super();
//        for (Book book : books) {
//            this.books.add(book);
//        };
//    }
//        public void createBook1(String realTitle, String realAuthor){title = realTitle; author = realAuthor;}

    public Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        return newBook;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Books Collection {" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
