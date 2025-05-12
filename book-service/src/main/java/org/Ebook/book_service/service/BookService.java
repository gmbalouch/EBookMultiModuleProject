package org.Ebook.book_service.service;

import org.Ebook.book_service.entity.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.*;

@Service
public class BookService {
    private final Map<Long, Book> bookStore = new HashMap<>();

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookStore.values());
    }

    public Book getBookById(Long id) {
        return bookStore.get(id);
    }

    public Book addBook(Book book) {
        bookStore.put(book.getId(), book);
        return book;
    }

    public Book updateBook(Long id, Book book) {
        bookStore.put(id, book);
        return book;
    }

    public void deleteBook(Long id) {
        bookStore.remove(id);
    }

}