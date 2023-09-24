package main.com.company.task16;

import main.com.company.task12.Book;

import java.util.Comparator;

public class BookAuthorTitlePriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        int authorCompare = b1.getAuthor().compareTo(b2.getAuthor());
        if (authorCompare != 0) {
            return authorCompare;
        } else {
            int titleCompare = b1.getTitle().compareTo(b2.getTitle());
            if (titleCompare != 0) {
                return titleCompare;
            } else {
                return Double.compare(b1.getPrice(), b2.getPrice());
            }
        }
    }
}
