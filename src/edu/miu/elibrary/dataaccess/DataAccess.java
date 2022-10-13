package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.business.Book;
import edu.miu.elibrary.business.LibraryMember;

import java.util.HashMap;

public interface DataAccess {
    HashMap<String, Book> readBooksMap();

    HashMap<String, User> readUserMap();

    HashMap<String, LibraryMember> readMemberMap();

    void saveNewMember(LibraryMember member);
}
