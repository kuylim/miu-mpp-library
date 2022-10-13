package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.*;
import edu.miu.elibrary.dataaccess.DataAccessFacade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author: Kuylim TITH
 * Date: 10/13/2022
 */
public class CheckoutController {

    private DataAccessFacade dataAccess;

    public CheckoutController() {
        dataAccess = new DataAccessFacade();
    }

    public Map<String, Object> checkoutBook(String isbn, String memberId) {
//        Map<String, Object> result = new HashMap<>();
//        result.put("isError", false);
//        Map<String, Book> bookMap = dataAccess.readBooksMap();
//        if (!bookMap.containsKey(isbn)) {
//            result.put("isError", true);
//            result.put("message", "Invalid ISBN");
//            return result;
//        }
//
//        Map<String, LibraryMember> libraryMemberMap = dataAccess.readMemberMap();
//        if (!libraryMemberMap.containsKey(memberId)) {
//            result.put("isError", true);
//            result.put("message", "Invalid Member ID");
//            return result;
//        }
//        LibraryMember member = libraryMemberMap.get(memberId);
//        CheckoutRecord checkoutRecord = member.getCheckoutRecord();
//        if(checkoutRecord == null) {
//            checkoutRecord = new CheckoutRecord();
//            member.setCheckoutRecord(checkoutRecord);
//        }
//        Book book = bookMap.get(isbn);
//        List<BookCopy> bookCopies = book.getBookCopies().stream().filter(o ->
//                "A".equals(o.getStatus())).toList();
//        BookCopy bookCopy = bookCopies.get(0);
//
//        checkoutRecord.getCheckoutRecordEntries().add(new CheckoutRecordEntry(LocalDate.now(),
//                LocalDate.now().plusDays(book.getMaxCheckoutLength()), bookCopy));
//        dataAccess.saveNewMember(member);
//        return result;
        return null;
    }
}
