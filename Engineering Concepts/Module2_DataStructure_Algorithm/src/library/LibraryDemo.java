package library;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryDemo {

    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "Clean Code", "Robert Martin"),
                new Book(2, "Effective Java", "Joshua Bloch"),
                new Book(3, "The Pragmatic Programmer", "David Thomas"),
                new Book(4, "Refactoring", "Martin Fowler")
        };

        Book linearResult = LibrarySearch.linearSearchByTitle(books, "Effective Java");
        System.out.println("Linear search result: " + linearResult);

        Book[] sortedBooks = Arrays.copyOf(books, books.length);
        Arrays.sort(sortedBooks, Comparator.comparing(Book::getTitle));

        Book binaryResult = LibrarySearch.binarySearchByTitle(sortedBooks, "Refactoring");
        System.out.println("Binary search result: " + binaryResult);
    }
}
