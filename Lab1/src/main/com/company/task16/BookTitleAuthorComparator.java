package main.com.company.task16;

import main.com.company.task12.Book;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        int titleCompare = b1.getTitle().compareTo(b2.getTitle());
        if (titleCompare != 0) {
            return titleCompare;
        } else {
            return b1.getAuthor().compareTo(b2.getAuthor());
        }
    }
}
