package edu.miu.elibrary.business;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class Author extends Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 624504775983828982L;

    private int id;
    private List<Book> books;

    public Author(String firstName, String lastName, String phone, Address address) {
        super(firstName, lastName, phone, address);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }
}
