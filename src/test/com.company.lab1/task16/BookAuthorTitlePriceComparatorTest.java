package test.com.company.lab1.task16;

import main.com.company.lab1.task12.Book;
import main.com.company.lab1.task16.BookAuthorTitlePriceComparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookAuthorTitlePriceComparatorTest {

    @Test
    void givenBooksWithDifferentAuthors_whenSortWithBookAuthorTitlePriceComparator_thenReturnSortedByAuthor() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("title1", "a5", 5),
                new Book("title2", "a4", 3),
                new Book("title3", "a3", 1),
                new Book("title4", "a2", 2),
                new Book("title5", "a1", 4))
        );
        List<Book> expected = List.of(
                books.get(4), books.get(3), books.get(2), books.get(1), books.get(0)
        );
        books.sort(new BookAuthorTitlePriceComparator());
        assertIterableEquals(expected, books);
    }

    @Test
    void givenBooksWithAllSameAuthors_whenSortWithBookAuthorTitlePriceComparator_thenReturnSortedByTitle() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("title5", "author", 1),
                new Book("title3", "author", 2),
                new Book("title1", "author", 3),
                new Book("title2", "author", 4),
                new Book("title4", "author", 5))
        );
        List<Book> expected = List.of(
                books.get(2), books.get(3), books.get(1), books.get(4), books.get(0)
        );
        books.sort(new BookAuthorTitlePriceComparator());
        assertIterableEquals(expected, books);
    }

    @Test
    void givenBooksWithAllSameAuthorsAndTitles_whenSortWithBookAuthorTitlePriceComparator_thenReturnSortedByPrice() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("title", "author", 4),
                new Book("title", "author", 2),
                new Book("title", "author", 5),
                new Book("title", "author", 1),
                new Book("title", "author", 3))
        );
        List<Book> expected = List.of(
                books.get(3), books.get(1), books.get(4), books.get(0), books.get(2)
        );
        books.sort(new BookAuthorTitlePriceComparator());
        assertIterableEquals(expected, books);
    }

}