package edu.miu.elibrary.business.dto;

import java.time.LocalDate;

/**
 * Author: Kuylim TITH
 * Date: 10/14/2022
 */
public class BookOverdue {

    private String isbn;
    private String title;
    private String copyNumber;
    private String borrowBy;
    private LocalDate dueDate;
    private String isOverdue;

    public BookOverdue(String isbn, String title, String copyNumber, String borrowBy, LocalDate dueDate, String isOverdue) {
        this.isbn = isbn;
        this.title = title;
        this.copyNumber = copyNumber;
        this.borrowBy = borrowBy;
        this.dueDate = dueDate;
        this.isOverdue = isOverdue;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCopyNumber() {
        return copyNumber;
    }

    public void setCopyNumber(String copyNumber) {
        this.copyNumber = copyNumber;
    }

    public String getBorrowBy() {
        return borrowBy;
    }

    public void setBorrowBy(String borrowBy) {
        this.borrowBy = borrowBy;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue;
    }
}
