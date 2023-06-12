package ru.cinimex.startjava.graduation.bookshelf;

public class Book {

    private final String bookName;
    private final String author;
    private final int year;

    public Book(String bookName, int year, String author) {
        this.bookName = bookName;
        this.year = year;
        this.author = author;

    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "[" + bookName + ", " + year + ", " + author + "]";
    }

}
