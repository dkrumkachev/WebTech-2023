package main.com.company.task15;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.getClass() == this.getClass() &&
                ((Book)obj).title.equals(this.title) &&
                ((Book)obj).author.equals(this.author) &&
                ((Book)obj).price == this.price &&
                ((Book)obj).isbn == this.isbn;
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, isbn);
    }

    @Override
    public String toString() {
        return title + " " + author + " " + price + " " + isbn;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.isbn, other.isbn);
    }

}
