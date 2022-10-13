package edu.miu.elibrary.business;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class Author extends Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 624504775983828982L;
    private String quote;
    private List<Book> books;

    public Author(String firstName, String lastName, String phone, Address address, String quote) {
        super(firstName, lastName, phone, address);
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
