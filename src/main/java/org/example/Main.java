package org.example;

public class Main {
    public static void main(String[] args) {
        Book Fantasy = new Book("Stein der Waisen", "J.K. Rowling", "978-3-551-35401-3");
        Book Krimi = new Book("Achtsam morden", "Karsten Dusse", "978-3-453-43968-9");
        System.out.println();
        System.out.println(Fantasy.toString());
        System.out.println(Krimi.toString());

        Book[] collectionOfBooks = new Book[2];
        collectionOfBooks[0] = new Book("Der Herr der Ringe", "John R.R. Tolkien", "978-3-608-93984-2");
        collectionOfBooks[1] = new Book("Das Café am Rande der Welt", "John Strelecky", "978-3-423-28984-9");

        Library myLibrary = new Library(collectionOfBooks);

        myLibrary.displayLibraryContents();

    }
}