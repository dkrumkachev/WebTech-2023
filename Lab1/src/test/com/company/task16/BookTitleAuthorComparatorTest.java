package test.com.company.task16;

import main.com.company.task12.Book;
import main.com.company.task16.BookTitleAuthorComparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class BookTitleAuthorComparatorTest {

    @Test
    void givenBooksWithDifferentTitles_whenSortWithBookTitleAuthorComparator_thenReturnSortedByTitle() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("title3", "a2", 0),
                new Book("title1", "a4", 0),
                new Book("title4", "a3", 0),
                new Book("title5", "a5", 0),
                new Book("title2", "a1", 0))
        );
        List<Book> expected = List.of(
                books.get(1), books.get(4), books.get(0), books.get(2), books.get(3)
        );
        books.sort(new BookTitleAuthorComparator());
        assertIterableEquals(expected, books);
    }

    @Test
    void givenBooksWithSameTitles_whenSortWithBookTitleAuthorComparator_thenReturnSortedByTitleThenByAuthor() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("title2", "a2", 0),
                new Book("title4", "a4", 0),
                new Book("title2", "a3", 0),
                new Book("title5", "a5", 0),
                new Book("title4", "a1", 0))
        );
        List<Book> expected = List.of(
                books.get(0), books.get(2), books.get(4), books.get(1), books.get(3)
        );
        books.sort(new BookTitleAuthorComparator());
        assertIterableEquals(expected, books);
    }

    @Test
    void givenBooksWithAllSameTitles_whenSortWithBookTitleAuthorComparator_thenReturnSortedByAuthor() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("title", "a2", 0),
                new Book("title", "a4", 0),
                new Book("title", "a3", 0),
                new Book("title", "a5", 0),
                new Book("title", "a1", 0))
        );
        List<Book> expected = List.of(
                books.get(4), books.get(0), books.get(2), books.get(1), books.get(3)
        );
        books.sort(new BookTitleAuthorComparator());
        assertIterableEquals(expected, books);
    }

}