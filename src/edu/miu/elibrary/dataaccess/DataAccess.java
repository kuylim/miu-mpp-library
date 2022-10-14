package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.auth.User;
import edu.miu.elibrary.business.*;

import java.time.LocalDate;

public interface DataAccess {

    User findUserByUsername(String username);

    Book findBookByIsbn(String isbn);

    BookCopy findAvailableBookCopyByBook(int bookId);

    LibraryMember findLibraryMemberById(int id);

    CheckoutRecord findCheckoutRecord(int memberId);

    CheckoutRecordEntry saveCheckoutEntry(LocalDate checkoutDate, LocalDate dueDate, BookCopy bookCopy);

    CheckoutRecord saveCheckoutRecord(int memberId, int checkoutEntryId);

    void setBookCopyToBorrowed(int id);
}
