package ru.cinimex.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {

    private int countBooks;
    private final int MAX_BOOKS_COUNT = 10;
    private final Book[] books = new Book[MAX_BOOKS_COUNT];

    public boolean addBook(String bookName, int year, String author) {
        if (countBooks == MAX_BOOKS_COUNT) {
            System.out.println("Книжная полка заполнена.");
            return false;
        }
        books[countBooks] = new Book(bookName, year, author);
        countBooks++;
        return true;
    }

    public boolean deleteBook(String bookName) {
        int bookId = getBookId(bookName);
        if (bookId >= 0) {
            int newBooksLength = countBooks - bookId - 1;
            if (newBooksLength > 0) {
                System.arraycopy(books, bookId + 1, books, bookId, newBooksLength);
            }
            countBooks--;
            books[countBooks] = null;
            return true;
        } else return false;
    }

    public String getBook(String bookName) {
        int bookId = getBookId(bookName);
        if (bookId >= 0) {
            return books[bookId].toString();
        } else return null;
    }

    public Book[] getAllBooks() {
        System.out.println("\nКнижная полка:");
        for (int i = 0; i < countBooks; i++) {
            System.out.print("[K]");
        }
        for (int i = 0; i < getFreePlace(); i++) {
            System.out.print("[ ]");
        }
        System.out.println("");
        return Arrays.copyOf(books, countBooks);
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getFreePlace() {
        return MAX_BOOKS_COUNT - countBooks;
    }

    public int getBookId(String bookName) {
        for (int i = 0; i < countBooks; i++) {
            if (bookName.equals(books[i].getBookName())) {
                return i;
            }
        }
        return -1;
    }
}
