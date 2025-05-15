package org.Ebook.common_entities.exception;

public class OrderNotFoundException extends ResourceNotFoundException {
    public OrderNotFoundException(Long id) {
        super("Order not found with ID: " + id);
    }
}