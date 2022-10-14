package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.dataaccess.AddressRepository;

import java.sql.SQLException;

public class AddressController {
    private final AddressRepository addressRepository;

    public AddressController(){
        addressRepository = new AddressRepository();
    }

    public Address add(Address a) throws SQLException {
        return addressRepository.add(a);
    }

    public Address add(String street, String city, String state, String zip) {
        Address address = new Address(street, city, state, zip);
        return addressRepository.add(address);
    }

}
