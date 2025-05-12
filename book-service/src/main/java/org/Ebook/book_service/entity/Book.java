package org.Ebook.book_service.entity;


public class Book {
    private Long id;
    private String little;
    private String author;

    public Long getId() {
        return id;
    }

    public String getLittle() {
        return little;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLittle(String little) {
        this.little = little;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
