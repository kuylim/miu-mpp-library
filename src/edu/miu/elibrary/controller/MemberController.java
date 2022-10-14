package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.business.LibraryMember;
import edu.miu.elibrary.dataaccess.MemberDataAccess;
import edu.miu.elibrary.dataaccess.MemberDataAccessFacade;

import java.sql.SQLException;

public class MemberController {

    MemberDataAccess dataAccess;

    public MemberController() {
        dataAccess = new MemberDataAccessFacade();
    }

    public LibraryMember add(LibraryMember mem) throws SQLException {
        return dataAccess.add(mem);
    }

    public LibraryMember add(String firstname, String lastname, String phoneNumber, int addressId) {
        LibraryMember libraryMember = new LibraryMember(firstname, lastname, phoneNumber);
        libraryMember.setAddressId(addressId);
        return dataAccess.add(libraryMember);
    }

    public Address add(Address a) throws SQLException {
        return dataAccess.add(a);
    }

    public Address add(String street, String city, String state, String zip) {
        Address address = new Address(street, city, state, zip);
        return dataAccess.add(address);
    }
}
