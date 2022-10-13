package edu.miu.elibrary.business;

import java.io.Serializable;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class LibraryMember implements Serializable {

    private final long serialVersionUID = 545264044109559457L;

    private String memberId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;

    public LibraryMember(String memberId, String firstName, String lastName, String phoneNumber, Address address) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
