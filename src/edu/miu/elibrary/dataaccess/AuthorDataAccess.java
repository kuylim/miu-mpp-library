package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.business.Author;

import java.sql.SQLException;

public interface AuthorDataAccess {
    boolean addAuthor(Author author) throws SQLException;
}
