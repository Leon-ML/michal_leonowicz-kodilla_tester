package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager extends Book{
    public BookManager(String title, String author) {
        super(title, author);
    }
    public static Set<Book> books = new HashSet<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        books.add(newBook);

        for (Book book : books)
            if (book.equals(newBook)){
                System.out.println("Is it there?" + book.equals(newBook));
                books.add(book);
                return book;
            } else {
                System.out.println("Is it there?" + book.equals(newBook));
            }
        books.add(newBook);
            return newBook;
    }
}
;