package codefinity;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookById(int id) {
        List<Book> booksToRemove = new ArrayList<>();

        for (Book book : books) {
            if (book.getId() == id) {
                booksToRemove.add(book);
            }
        }

        books.removeAll(booksToRemove);
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();

        for (Book book : books){
            if (book.getAuthor() == author) {
                booksByAuthor.add(book);
            }
        }

        if (!booksByAuthor.isEmpty()) {
            return booksByAuthor;
        } else {
            return Collections.emptyList();
        }

    }

    public List<Book> findBooksPublishedAfterYear(int year) {
        List<Book> booksPublishedAfterYear = new ArrayList<>();

        for (Book book : books){
            if (book.getYear() > year) {
                booksPublishedAfterYear.add(book);
            }
        }

        if (!booksPublishedAfterYear.isEmpty()) {
            return booksPublishedAfterYear;
        } else {
            return Collections.emptyList();
        }
    }

    public void displayAllBooks() {
        System.out.println(books);
    }
}
