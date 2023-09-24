package test.com.company.task14;

import main.com.company.task14.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BookTest {

    @Test
    void givenBook_whenClone_thenReturnCopyOfBook() {
        Book book = new Book("Title", "Author", 123);
        Book bookCopy = (Book) book.clone();
        assertTrue(book != bookCopy && book.equals(bookCopy));
    }
}