package org.Ebook.common_entities.exception;

public class BookNotFoundException extends ResourceNotFoundException {
    public BookNotFoundException(Long id) {
        super("Book not found with ID: " + id);
    }
}