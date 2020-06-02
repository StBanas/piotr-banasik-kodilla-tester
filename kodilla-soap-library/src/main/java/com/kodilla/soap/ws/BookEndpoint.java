package com.kodilla.soap.ws;

import com.kodilla.soap.library.Books;
import com.kodilla.courses.soap.GetBookRequest;
import com.kodilla.courses.soap.GetBookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookEndpoint {
    private static final String NAMESPACE_URI = "http://kodilla.com/courses/soap";

    private Books booksRepository;

    @Autowired
    public BookEndpoint(Books booksRepository) {
            this.booksRepository = booksRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetBookResponse getBook(@RequestPayload GetBookRequest request) {
        GetBookResponse response = new GetBookResponse();
        response.setBook(booksRepository.findBook(request.getISBN()));

        return response;
    }
}