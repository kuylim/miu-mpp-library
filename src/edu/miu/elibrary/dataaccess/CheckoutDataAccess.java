package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.business.*;
import edu.miu.elibrary.business.dto.BookOverdue;

import java.time.LocalDate;
import java.util.List;

public interface CheckoutDataAccess {
    BookCopy findAvailableBookCopyByBook(int bookId);
    Book findBookByIsbn(String isbn);
    CheckoutRecord findCheckoutRecord(int memberId);

    CheckoutRecordEntry saveCheckoutEntry(LocalDate checkoutDate, LocalDate dueDate, BookCopy bookCopy);

    void saveCheckoutRecord(int memberId, int checkoutEntryId);

    void setBookCopyToBorrowed(int id);
    List<BookOverdue> findOverdueBooksCheckout(String isbn);
    LibraryMember findLibraryMemberById(int id);
}
