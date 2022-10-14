package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.*;
import edu.miu.elibrary.dataaccess.DataAccessFacade;
import edu.miu.elibrary.exception.BookCheckoutException;

import java.time.LocalDate;
import java.util.*;

/**
 * Author: Kuylim TITH
 * Date: 10/13/2022
 */
public class CheckoutController {

    private final DataAccessFacade dataAccess;

    public CheckoutController() {
        dataAccess = new DataAccessFacade();
    }

    public boolean checkoutBook(String isbn, int memberId) {

        Book book = dataAccess.findBookByIsbn(isbn);
        if (Objects.isNull(book)) {
            throw new BookCheckoutException("Book not found");
        }

        LibraryMember libraryMember = dataAccess.findLibraryMemberById(memberId);
        if (Objects.isNull(libraryMember)) {
            throw new BookCheckoutException("Library member not found");
        }

        // getBookCopy
        BookCopy bookCopy = dataAccess.findAvailableBookCopyByBook(book.getId());
        if (Objects.isNull(bookCopy)) {
            throw new BookCheckoutException("Currently, book not available");
        }
        LocalDate dueDate = LocalDate.now().plusDays(book.getMaxCheckoutLength());
        CheckoutRecordEntry checkoutRecordEntry = dataAccess.saveCheckoutEntry(LocalDate.now(), dueDate, bookCopy);
        dataAccess.saveCheckoutRecord(libraryMember.getMemberId(), checkoutRecordEntry.getId());
        dataAccess.setBookCopyToBorrowed(bookCopy.getId());
        return true;
    }
}
