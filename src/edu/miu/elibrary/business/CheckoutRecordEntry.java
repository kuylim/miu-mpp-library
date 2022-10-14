package edu.miu.elibrary.business;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Author: Kuylim TITH
 * Date: 10/13/2022
 */
public class CheckoutRecordEntry implements Serializable {
    @Serial
    private static final long serialVersionUID = 4950189816707298711L;
    private int id;
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private BookCopy bookCopy;

    public CheckoutRecordEntry() {
    }

    public CheckoutRecordEntry(int id) {
        this.id = id;
    }

    public CheckoutRecordEntry(int id, LocalDate checkoutDate, LocalDate dueDate, BookCopy bookCopy) {
        this.id = id;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.bookCopy = bookCopy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(BookCopy bookCopy) {
        this.bookCopy = bookCopy;
    }

    public String getOverdue() {
        if (LocalDate.now().isAfter(this.dueDate)) return "Yes";
        return "No";
    }

    @Override
    public String toString() {
        return "Book copy number: " + bookCopy.getCopyNumber() + ", Checkout Date: " + checkoutDate
                + ", Due date: " + dueDate + ", Is overdue: " + getOverdue() + "\n";
    }
}
