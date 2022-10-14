package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.LibraryMember;
import edu.miu.elibrary.dataaccess.DataAccess;
import edu.miu.elibrary.dataaccess.DataAccessFacade;

import java.sql.SQLException;

public class MemberController {

    DataAccess dataAccess;

    public MemberController() {
        dataAccess = new DataAccessFacade();
    }

    public LibraryMember add(LibraryMember mem) throws SQLException {
        return dataAccess.add(mem);
    }

    public LibraryMember add(String firstname, String lastname, String phoneNumber, int addressId) {
        LibraryMember libraryMember = new LibraryMember(firstname, lastname, phoneNumber);
        libraryMember.setAddressId(addressId);
        return dataAccess.add(libraryMember);
    }
}
