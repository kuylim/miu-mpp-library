package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.dataaccess.DataAccess;
import edu.miu.elibrary.dataaccess.DataAccessFacade;

import java.sql.SQLException;

public class AddressController {
    private final DataAccess dataAccess;

    public AddressController(){
        dataAccess = new DataAccessFacade();
    }

    public Address add(Address a) throws SQLException {
        return dataAccess.add(a);
    }

    public Address add(String street, String city, String state, String zip) {
        Address address = new Address(street, city, state, zip);
        return dataAccess.add(address);
    }

}
