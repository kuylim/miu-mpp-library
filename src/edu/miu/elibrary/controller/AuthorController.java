package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.business.Author;
import edu.miu.elibrary.dataaccess.AuthorDataAccess;
import edu.miu.elibrary.dataaccess.AuthorDataAccessFacade;
import edu.miu.elibrary.dataaccess.DataAccessFacade;

import java.sql.SQLException;

public class AuthorController {
    private final AuthorDataAccess dataAccess;

    public AuthorController() {
        this.dataAccess = new AuthorDataAccessFacade();
    }

    public Author getAuthor(String firstName, String lastName, String phoneNumber, String street, String city, String state, String zip) {
        return new Author(firstName, lastName, phoneNumber, new Address(street, city, state, zip));
    }
    public boolean addAuthor(Author author) throws SQLException {
        return  dataAccess.addAuthor(author);
    }

}
