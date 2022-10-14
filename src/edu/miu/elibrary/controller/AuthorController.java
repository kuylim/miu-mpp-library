package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.business.Author;
import edu.miu.elibrary.dataaccess.DataAccessFacade;

import java.sql.SQLException;

public class AuthorController {
    private DataAccessFacade dataAccessFacade;

    public AuthorController(DataAccessFacade dataAccessFacade) {
        this.dataAccessFacade = dataAccessFacade;
    }

    public Author getAuthor(String firstName, String lastName, String phoneNumber, String street, String city, String state, String zip) {
        return new Author(firstName, lastName, phoneNumber, new Address(street, city, state, zip));
    }
    public boolean addAuthor(Author author) throws SQLException {
        return  dataAccessFacade.addAuthor(author);
    }

}
