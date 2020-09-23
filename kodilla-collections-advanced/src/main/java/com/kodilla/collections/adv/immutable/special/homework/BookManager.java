package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    public static Set<Book> books = new HashSet<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        boolean result = books.add(newBook);

            if (result){
                System.out.println("Book has been added");
            } else {
                System.out.println("Book has not been added");
            }
            return newBook;
    }
}
;