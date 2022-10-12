package edu.miu.elibrary.business;

import java.io.Serializable;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class Author implements Serializable {

    private final long serialVersionUID = -8606166743240086558L;

    private String firstName;
    private String lastName;
    private String phone;
    private Address address;
    private String quote;

    public Author(String firstName, String lastName, String phone, Address address, String quote) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.quote = quote;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                ", quote='" + quote + '\'' +
                '}';
    }
}
