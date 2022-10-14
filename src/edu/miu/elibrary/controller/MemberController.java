package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.business.LibraryMember;
import edu.miu.elibrary.dataaccess.MemberDataAccess;
import edu.miu.elibrary.dataaccess.MemberDataAccessFacade;

import java.util.Objects;

public class MemberController {

    MemberDataAccess dataAccess;

    public MemberController() {
        dataAccess = new MemberDataAccessFacade();
    }

    public LibraryMember addMember(String firstname, String lastname, String phoneNumber,
                                   String street, String city, String state, String zip) {
        Address address = new Address(street, city, state, zip);
        address = dataAccess.saveAddress(address);
        if(!Objects.isNull(address)) {
            LibraryMember libraryMember = new LibraryMember(firstname, lastname, phoneNumber);
            libraryMember.setAddressId(address.getId());
            return dataAccess.saveLibraryMember(libraryMember);
        }
        return null;
    }
}
