package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.*;
import edu.miu.elibrary.dataaccess.CheckoutDataAccess;
import edu.miu.elibrary.dataaccess.CheckoutDataAccessFacade;
import edu.miu.elibrary.dataaccess.DataAccessFacade;
import edu.miu.elibrary.exception.BookCheckoutException;

import java.time.LocalDate;
import java.util.*;

/**
 * Author: Kuylim TITH
 * Date: 10/13/2022
 */
public class CheckoutController {

    private final CheckoutDataAccess dataAccess;

    public CheckoutController() {
        dataAccess = new CheckoutDataAccessFacade();
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

    public Object[][] findCheckoutRecord(int memberId) {
        Object[][] tableData = null;
        LibraryMember libraryMember = dataAccess.findLibraryMemberById(memberId);
        if (Objects.isNull(libraryMember)) {
            throw new BookCheckoutException("Library member not found");
        }

        CheckoutRecord checkoutRecord = dataAccess.findCheckoutRecord(memberId);
        List<CheckoutRecordEntry> entries = checkoutRecord.getCheckoutRecordEntries();

        tableData = convertCheckoutRecordTo2DArray(entries);
        return tableData;
    }

    private Object[][] convertCheckoutRecordTo2DArray(List<CheckoutRecordEntry> recordEntries) {
        Object[][] tableData = null;
        tableData = recordEntries.stream()
                .map(p -> new Object[] {p.getBookCopy().getCopyNumber(), p.getCheckoutDate(), p.getDueDate(), p.getOverdue()})
                .toArray(Object[][]::new);
        return tableData;
    }
}
