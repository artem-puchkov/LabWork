package LabWork2;

import java.util.Arrays;
import java.util.Comparator;

public class Task7 {
}

class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}

class Bookshelf {
    private Book[] books;
    private int bookCount;

    public Bookshelf(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Книжная полка заполнена. Нельзя добавить больше книг.");
        }
    }

    public Book getEarliestBook() {
        if (bookCount == 0) {
            return null;
        }

        Book earliestBook = books[0];
        for (int i = 1; i < bookCount; i++) {
            if (books[i].getYear() < earliestBook.getYear()) {
                earliestBook = books[i];
            }
        }

        return earliestBook;
    }

    public Book getLatestBook() {
        if (bookCount == 0) {
            return null;
        }

        Book latestBook = books[0];
        for (int i = 1; i < bookCount; i++) {
            if (books[i].getYear() > latestBook.getYear()) {
                latestBook = books[i];
            }
        }

        return latestBook;
    }

    public void organizeBooksByYear() {
        Arrays.sort(books, 0, bookCount, Comparator.comparingInt(Book::getYear));
    }

    public void printBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }
}

class BookTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(5);

        bookshelf.addBook(new Book("Пушкин", "Книга", 2000));
        bookshelf.addBook(new Book("Пушкин", "Книгаа", 1995));

        Book earliestBook = bookshelf.getEarliestBook();
        if (earliestBook != null) {
            System.out.println("Самая ранняя книга: " + earliestBook);
        }

        Book latestBook = bookshelf.getLatestBook();
        if (latestBook != null) {
            System.out.println("Самая поздняя книга: " + latestBook);
        }

        bookshelf.organizeBooksByYear();
        System.out.println("Книги на полке в порядке возрастания года издания:");
        bookshelf.printBooks();
    }
}
