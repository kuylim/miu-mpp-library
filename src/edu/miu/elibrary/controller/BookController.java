package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.Author;
import edu.miu.elibrary.business.Book;
import edu.miu.elibrary.business.BookCopy;
import edu.miu.elibrary.business.LibraryMember;
import edu.miu.elibrary.dataaccess.DataAccessFacade;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookController {

    private List<Author> authors;
    private Book book;
    private DataAccessFacade dataAccessFacade;

    public BookController(DataAccessFacade dataAccessFacade) {
        this.dataAccessFacade = dataAccessFacade;
    }

    public List<Book> getAllBooks() {
//        System.out.println(new ArrayList<>(dataAccessFacade.readBooksMap().values()));
        return null;
    }


    public Book saveNewBook(Book book) throws SQLException {
        return dataAccessFacade.saveNewBook(book);
    }


    public String createNewBook(String isbn, String title, int numberOfCopy, List<Author> author) throws SQLException {
        Book book = new Book(isbn, title, numberOfCopy, author);
        List<BookCopy> bookCopies = new ArrayList<>();
        for(int i = 1; i <= numberOfCopy; i++) {
            BookCopy bookCopy = new BookCopy();
            bookCopy.setCopyNumber(UUID.randomUUID().toString());
            bookCopy.setStatus("A");
            bookCopies.add(bookCopy);
        }
        book.setBookCopies(bookCopies);
        Book result = saveNewBook(book);
        return result.getTitle();
    }

    public List<Author> getAuthors() {
        return dataAccessFacade.getAuthors();
    }

    public DefaultListModel<Author> getAuthorListModel() {
        DefaultListModel<Author> listModel = new DefaultListModel<>();
        authors = dataAccessFacade.getAuthors();
        for (Author author : authors) {
            listModel.addElement(author);
        }
        return listModel;
    }

    public Book searchBy(String isbn) throws SQLException {
        book = dataAccessFacade.searchBookBy(isbn);
        return book;
    }

    public boolean addBookCopy(int numberOfCopy) throws SQLException {
        List<BookCopy> newBookCopies = new ArrayList<>();
        for(int i = 1; i <= numberOfCopy; i++) {
            BookCopy bookCopy = new BookCopy();
            bookCopy.setCopyNumber(UUID.randomUUID().toString());
            bookCopy.setStatus("A");
            newBookCopies.add(bookCopy);
        }
        return dataAccessFacade.addBookCopy(book, newBookCopies);
    }


}
