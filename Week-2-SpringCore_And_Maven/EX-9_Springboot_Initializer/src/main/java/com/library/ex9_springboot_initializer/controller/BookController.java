package com.library.ex9_springboot_initializer.controller;

import com.library.ex9_springboot_initializer.entity.Book;
import com.library.ex9_springboot_initializer.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository repository;

    // Create Book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }

    // Read All Books
    @GetMapping
    public List<Book> getBooks() {
        return repository.findAll();
    }

    // Read Book By ID
    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable Long id) {
        return repository.findById(id);
    }

    // Update Book
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,
                           @RequestBody Book newBook) {

        Book book = repository.findById(id).orElseThrow();

        book.setTitle(newBook.getTitle());
        book.setAuthor(newBook.getAuthor());
        book.setPrice(newBook.getPrice());

        return repository.save(book);
    }

    // Delete Book
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {

        repository.deleteById(id);

        return "Book deleted successfully.";
    }

}