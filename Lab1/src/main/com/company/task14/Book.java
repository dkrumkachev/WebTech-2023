package main.com.company.task14;

import java.util.Objects;

public class Book implements Cloneable{
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.getClass() == this.getClass() &&
                ((Book)obj).title.equals(this.title) &&
                ((Book)obj).author.equals(this.author) &&
                ((Book)obj).price == this.price;
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return title + " " + author + " " + price;
    }

    @Override
    public Object clone() {
        return new Book(this.title, this.author, this.price);
    }
}
