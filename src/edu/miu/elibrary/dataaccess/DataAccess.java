package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.auth.User;
import edu.miu.elibrary.business.*;

import java.time.LocalDate;

import edu.miu.elibrary.business.Author;
import edu.miu.elibrary.business.Book;
import edu.miu.elibrary.business.BookCopy;
import edu.miu.elibrary.business.dto.BookOverdue;

import java.sql.SQLException;
import java.util.List;

public interface DataAccess {

    User findUserByUsername(String username);

    Book findBookByIsbn(String isbn);

    BookCopy findAvailableBookCopyByBook(int bookId);

    LibraryMember findLibraryMemberById(int id);

    CheckoutRecord findCheckoutRecord(int memberId);

    CheckoutRecordEntry saveCheckoutEntry(LocalDate checkoutDate, LocalDate dueDate, BookCopy bookCopy);

    CheckoutRecord saveCheckoutRecord(int memberId, int checkoutEntryId);

    void setBookCopyToBorrowed(int id);


    Book saveNewBook(Book book) throws SQLException;

    Book searchBookBy(String isbn) throws SQLException;

    boolean addBookCopy(Book book, List<BookCopy> bookCopies) throws SQLException;
    List<Author> getAuthors();

    boolean addAuthor(Author author) throws SQLException;

    List<BookOverdue> findOverdueBooksCheckout(String isbn);

}
