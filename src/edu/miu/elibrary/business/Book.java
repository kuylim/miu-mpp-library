package edu.miu.elibrary.business;

import java.io.Serializable;
import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class Book implements Serializable {
    
    private final long serialVersionUID = 7080962269839330692L;

    private String isbn;
    private String title;
    private int numberOfCopy;
    private List<Author> authors;

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