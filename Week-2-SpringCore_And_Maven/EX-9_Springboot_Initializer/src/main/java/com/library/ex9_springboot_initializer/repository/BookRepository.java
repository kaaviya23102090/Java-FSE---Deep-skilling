package com.library.ex9_springboot_initializer.repository;
import com.library.ex9_springboot_initializer.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}