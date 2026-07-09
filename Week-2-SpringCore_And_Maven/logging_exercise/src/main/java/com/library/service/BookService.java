package com.library.service;

public class BookService {

    public void addBook() {

        System.out.println("Adding Book...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Book Added Successfully");
    }
}