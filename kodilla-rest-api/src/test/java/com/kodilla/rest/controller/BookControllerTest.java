package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BookControllerTest {

    @Test
    public void shouldFetchBooks() throws Exception {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }
    @Test
    public void shouldAddBooks() throws Exception {
        //given
        BookService bookService = new BookService();
        bookService.addBook(new BookDto("Title 4", "Author 4"));

        //when
        int result2 = bookService.getBooks().size();
        String result = bookService.getBooks().get(0).getTitle();

        //then
        Assert.assertEquals(result2, 1);
        Assert.assertEquals(result, "Title 4");
    }

}