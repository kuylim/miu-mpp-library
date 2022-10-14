package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.auth.User;
import edu.miu.elibrary.business.Author;
import edu.miu.elibrary.business.Book;
import edu.miu.elibrary.business.BookCopy;

import java.sql.SQLException;
import java.util.List;

public interface DataAccess {

    User findUserByUsername(String username);

    Book saveNewBook(Book book) throws SQLException;

    Book searchBookBy(String isbn) throws SQLException;

    boolean addBookCopy(Book book, List<BookCopy> bookCopies) throws SQLException;
    List<Author> getAuthors();

}
