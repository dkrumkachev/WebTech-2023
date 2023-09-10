package main.com.company.lab1.task13;

import main.com.company.lab1.task12.Book;

import java.util.Objects;


public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price) {
        super(title, author, price);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return true;
        }
        return super.equals(obj) &&
                obj.getClass() == this.getClass() &&
                ((ProgrammerBook)obj).level == this.level &&
                ((ProgrammerBook)obj).language.equals(this.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return super.toString() + " " + language + " " + level;
    }
}
