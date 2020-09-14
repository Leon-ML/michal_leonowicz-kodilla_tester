package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {

        Set<Book> books = new HashSet<>();

        books.add(BookManager.createBook("Przygoda z owcą", "Murakami"));
        books.add(BookManager.createBook("Ostatni Papież", "Jose Miguel Rocha"));
        books.add(BookManager.createBook("Czerwony głód", "Anne Applebaum"));
        books.add(BookManager.createBook("Ojciec chrzestny", "Mario Puzo"));
        books.add(BookManager.createBook("Przygoda z owcą", "Murakami"));

        System.out.println(books.size());
        for (Book book : books)
            System.out.println(book);



    }
}
