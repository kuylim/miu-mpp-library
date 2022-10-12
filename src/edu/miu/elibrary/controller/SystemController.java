package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.Book;
import edu.miu.elibrary.business.LibraryMember;
import edu.miu.elibrary.dataaccess.DataAccessFacade;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class SystemController {

    private DataAccessFacade dataAccess;

    public SystemController() {
        dataAccess = new DataAccessFacade();
    }

    public List<Book> getAllBooks() {
        System.out.println(new ArrayList<>(dataAccess.readBooksMap().values()));
        return null;
    }

    public LibraryMember addMember(LibraryMember member) {
        return null;
    }
}
