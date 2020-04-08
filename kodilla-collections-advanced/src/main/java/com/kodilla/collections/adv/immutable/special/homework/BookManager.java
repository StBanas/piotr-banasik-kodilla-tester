package com.kodilla.collections.adv.immutable.special.homework;

public class BookManager extends Book{
    private String title;
    private String author;

    public BookManager(String title, String author) {
        super();
        this.title = getTitle();
        this.author = getAuthor();
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
        Book newBook = new BookManager(title, author);

        return newBook;
    }
}
