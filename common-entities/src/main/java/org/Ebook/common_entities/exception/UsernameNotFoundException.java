package org.Ebook.common_entities.exception;

public class UsernameNotFoundException extends ResourceNotFoundException {
    public UsernameNotFoundException(String username) {
        super("Username not found: " + username);
    }
}