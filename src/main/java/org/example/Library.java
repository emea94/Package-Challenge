package org.example;

import java.util.Arrays;

public class Library {
    // Eigenschaften
    private Book[] books;

    // Konstruktor
    public Library(Book[] books) {
        this.books = books;
    }

    // Methode
    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library Contents:\n" + Arrays.toString(books);
    }

    public void displayLibraryContents() {
        System.out.println(this.toString());
        }
    }
