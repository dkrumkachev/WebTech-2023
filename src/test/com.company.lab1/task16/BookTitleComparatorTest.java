package test.com.company.lab1.task16;

import main.com.company.lab1.task12.Book;
import main.com.company.lab1.task16.BookTitleComparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookTitleComparatorTest {

    @Test
    void givenBooksWithDifferentTitles_whenSortWithBookTitleComparator_thenReturnSortedByTitle() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("title5", "a1", 1),
                new Book("title4", "a2", 2),
                new Book("title3", "a3", 3),
                new Book("title2", "a4", 4),
                new Book("title1", "a5", 5))
        );
        List<Book> expected = List.of(
                books.get(4), books.get(3), books.get(2), books.get(1), books.get(0)
        );
        books.sort(new BookTitleComparator());
        assertIterableEquals(expected, books);
    }

    @Test
    void givenBooksWithSameTitles_whenSortWithBookTitleComparator_thenReturnSameList() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("title", "a5", 3),
                new Book("title", "a2", 4),
                new Book("title", "a3", 1),
                new Book("title", "a4", 5),
                new Book("title", "a1", 2))
        );
        List<Book> expected = List.copyOf(books);
        books.sort(new BookTitleComparator());
        assertIterableEquals(expected, books);
    }

}