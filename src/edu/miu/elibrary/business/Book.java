package edu.miu.elibrary.business;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class Book implements Serializable {

    @Serial
    private static final long serialVersionUID = -974228997834827410L;

    private int id;
    private String isbn;
    private String title;
    private int numberOfCopy;
    private int maxCheckoutLength;
    private List<Author> authors;
    private List<BookCopy> bookCopies;

    public Book(int id, String isbn, String title, int numberOfCopy, int maxCheckoutLength) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.numberOfCopy = numberOfCopy;
        this.maxCheckoutLength = maxCheckoutLength;
    }

    public Book(String isbn, String title, int numberOfCopy, List<Author> authors, int maxCheckoutLength) {
        this.isbn = isbn;
        this.title = title;
        this.numberOfCopy = numberOfCopy;
        this.authors = authors;
        this.maxCheckoutLength = maxCheckoutLength;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfCopy() {
        return numberOfCopy;
    }

    public void setNumberOfCopy(int numberOfCopy) {
        this.numberOfCopy = numberOfCopy;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<BookCopy> getBookCopies() {
        return bookCopies;
    }

    public void setBookCopies(List<BookCopy> bookCopies) {
        this.bookCopies = bookCopies;
    }

    public void setBookCopies(int numberOfCopy) {
        bookCopies = new ArrayList<>();
        for(int i = 1; i <= numberOfCopy; i++) {
            BookCopy bookCopy = new BookCopy();
            bookCopy.setCopyNumber(String.valueOf(System.currentTimeMillis() + i));
            bookCopy.setStatus("A");
            bookCopies.add(bookCopy);
        }
    }

    public int getMaxCheckoutLength() {
        return maxCheckoutLength;
    }

    public void setMaxCheckoutLength(int maxCheckoutLength) {
        this.maxCheckoutLength = maxCheckoutLength;
    }

    public void addCopy() {
        this.numberOfCopy += 1;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", numberOfCopy=" + numberOfCopy +
                ", authors=" + authors +
                '}';
    }
}
