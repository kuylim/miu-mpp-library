package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.business.LibraryMember;
import edu.miu.elibrary.dataaccess.AddressRepository;
import edu.miu.elibrary.dataaccess.MemberRepository;

import java.sql.SQLException;

public class AddressController {
    private AddressRepository address;

    public AddressController(){
        address = new AddressRepository();
    }

    public Address add(Address a) throws SQLException {
        return address.add(a);
    }

}
