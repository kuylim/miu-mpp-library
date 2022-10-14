package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.dto.BookOverdue;
import edu.miu.elibrary.dataaccess.DataAccess;
import edu.miu.elibrary.dataaccess.DataAccessFacade;

import java.util.List;
import java.util.Objects;

/**
 * Author: Kuylim TITH
 * Date: 10/14/2022
 */
public class OverdueController {

    private final DataAccess dataAccess;

    public OverdueController() {
        dataAccess = new DataAccessFacade();
    }

    public Object[][] findOverdueBooksCheckout(String isbn) {
        Object[][] tableData = new Object[][]{{}};
        List<BookOverdue> bookOverdues = dataAccess.findOverdueBooksCheckout(isbn);
        if (Objects.isNull(bookOverdues) || bookOverdues.isEmpty()) {
            return tableData;
        }
        tableData = bookOverdues.stream()
                .map(p -> new Object[] {p.getIsbn(), p.getTitle(), p.getCopyNumber(),
                        p.getBorrowBy(), p.getDueDate(), p.getIsOverdue()})
                .toArray(Object[][]::new);
        return tableData;
    }
}
