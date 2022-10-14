package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.Author;
import edu.miu.elibrary.business.Book;
import edu.miu.elibrary.business.BookCopy;
import edu.miu.elibrary.dataaccess.BookDataAccess;
import edu.miu.elibrary.dataaccess.BookDataAccessFacade;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

public class BookController {

    private List<Author> authors;
    private Book book;
    private final BookDataAccess dataAccess;

    public BookController() {
        this.dataAccess = new BookDataAccessFacade();
    }

    public List<Book> getAllBooks() {
//        System.out.println(new ArrayList<>(dataAccessFacade.readBooksMap().values()));
        return null;
    }


    public Book saveNewBook(Book book) throws SQLException {
        return dataAccess.saveNewBook(book);
    }


    public String createNewBook(String isbn, String title, int numberOfCopy, List<Author> author, int maxCheckoutLength) throws SQLException {
        Book book = new Book(isbn, title, numberOfCopy, author, maxCheckoutLength);
        book.setBookCopies(numberOfCopy);
        Book result = saveNewBook(book);
        return result.getTitle();
    }

    public List<Author> getAuthors() {
        return dataAccess.getAuthors();
    }

    public DefaultListModel<Author> getAuthorListModel() {
        DefaultListModel<Author> listModel = new DefaultListModel<>();
        authors = dataAccess.getAuthors();
        for (Author author : authors) {
            listModel.addElement(author);
        }
        return listModel;
    }

    public Book searchBy(String isbn) throws SQLException {
        book = dataAccess.searchBookBy(isbn);
        return book;
    }

    public boolean addBookCopy(int numberOfCopy) throws SQLException {
        return dataAccess.addBookCopy(book, BookCopy.setNewNumberOfCopy(numberOfCopy));
    }


}
