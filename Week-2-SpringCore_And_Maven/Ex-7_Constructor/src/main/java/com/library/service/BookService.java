package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Default Constructor
    public BookService(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }

    // Setter Injection

    public void issueBook() {
        System.out.println("Book Service: Setter Injection");
        bookRepository.displayBook();
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }
}