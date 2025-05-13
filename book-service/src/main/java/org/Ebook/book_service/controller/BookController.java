package org.Ebook.book_service.controller;


import org.Ebook.book_service.service.BookService;
import org.Ebook.common_entities.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookservice;

    @GetMapping
    public List<Book> getAll() {
        return bookservice.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getOne(@PathVariable Long id) {
        return bookservice.getBookById(id);
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
        return bookservice.addBook(book);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book book) {
        return bookservice.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookservice.deleteBook(id);
    }

}