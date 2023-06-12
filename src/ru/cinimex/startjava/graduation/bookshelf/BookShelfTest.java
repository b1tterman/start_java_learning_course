package ru.cinimex.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookShelfTest {

    public static void main(String[] args) {

        boolean repeat = true;
        BookShelf bookShelf = new BookShelf();
        Scanner scanner = new Scanner(System.in);
        bookShelf.addBook("name1", 1000, "author1");
        bookShelf.addBook("name2", 1500, "author2");
        bookShelf.addBook("name3", 2000, "author3");
        bookShelf.addBook("name4", 2023, "author4");
        while (repeat) {
            printAllBooks(bookShelf.getAllBooks());
            printMenu();
            switch (chooseMenu()) {
                case 1:
                    if (bookShelf.getCountBooks() < 10) {
                        System.out.println("Введите название книги");
                        String name = scanner.nextLine();
                        System.out.println("Введите год книги");
                        int year = Integer.parseInt(scanner.nextLine());
                        System.out.println("Введите автора книги");
                        String author = scanner.nextLine();
                        bookShelf.addBook(name, year, author);
                    } else {
                        System.out.println("Перед добавлением книги убедитесь что на полке есть место");
                    }
                    break;
                case 2:
                    System.out.println("Введите полное название удаляемой книги");
                    String deleteName = scanner.nextLine();
                    if (bookShelf.deleteBook(deleteName)) {
                        System.out.println("Книга удалена с полки");
                    } else System.out.println("Не удалось найти и удалить книгу");
                    break;
                case 3:
                    System.out.println("Введите полное название книги");
                    String nameBook = scanner.nextLine();
                    if (bookShelf.getBook(nameBook) != null) {
                        System.out.println("Книга найдена: ");
                        System.out.println(bookShelf.getBook(nameBook) + "\n");
                    } else System.out.println("Книга не найдена\n");
                    break;
                case 4:
                    System.out.println("Свободных мест на полке: " + bookShelf.getFreePlace());
                    break;
                case 5:
                    System.out.println("Количество книг на полке равно " + bookShelf.getCountBooks());
                    break;
                case 6:
                    repeat = false;
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("\nМЕНЮ:");
        System.out.println("1. Добавить книгу на полку");
        System.out.println("2. Удалить книгу с полки");
        System.out.println("3. Найти книгу по названию");
        System.out.println("4. Показать сколько свободных мест на полке");
        System.out.println("5. Количество книг на полке");
        System.out.println("6. Закрыть меню");
    }

    public static int chooseMenu() {
        int menu;
        System.out.print("\nВыберите пункт меню: ");
        Scanner scanner = new Scanner(System.in);
        menu = scanner.nextInt();
        if (menu > 0 && menu < 7) {
            return menu;
        } else return -1;
    }

    private static void printAllBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }


}
