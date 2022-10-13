package edu.miu.elibrary.business;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class Book implements Serializable {

    @Serial
    private static final long serialVersionUID = -974228997834827410L;
    private String isbn;
    private String title;
    private int numberOfCopy;
    private int maxCheckoutLength;
    private List<Author> authors;
    private List<BookCopy> bookCopies;

    public Book(String isbn, String title, int numberOfCopy, List<Author> authors) {
        this.isbn = isbn;
        this.title = title;
        this.numberOfCopy = numberOfCopy;
        this.authors = authors;
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
