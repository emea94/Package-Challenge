package org.example;

public class Book {
    //Eigenschaften
    private String title;
    private String author;
    private String isbn;
    //Konstruktoren
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    //Methode


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return String.format("Book [Title: %s, Author: %s, ISBN: %s]",
                title, author, isbn);
    }
}
