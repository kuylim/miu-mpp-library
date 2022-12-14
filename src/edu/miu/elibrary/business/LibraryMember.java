package edu.miu.elibrary.business;

import java.io.Serial;
import java.io.Serializable;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class LibraryMember extends Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -6565704637202603868L;
    private int addressId;

    private int memberId;
    private CheckoutRecord checkoutRecord;

    public LibraryMember(int memberId, String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
        this.memberId = memberId;
    }

    public LibraryMember(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
    }

    public LibraryMember(int memberId, String firstName, String lastName, String phoneNumber, Address address) {
        super(firstName, lastName, phoneNumber, address);
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public CheckoutRecord getCheckoutRecord() {
        return checkoutRecord;
    }

    public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
        this.checkoutRecord = checkoutRecord;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }
}
