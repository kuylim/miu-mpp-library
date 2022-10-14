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
    private String memberId;
    private int addressId;
    private CheckoutRecord checkoutRecord;

    public LibraryMember(String memberId, String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
        this.memberId = memberId;
    }

    public LibraryMember(String memberId, String firstName, String lastName, String phoneNumber, Address address) {
        super(firstName, lastName, phoneNumber, address);
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public long getAddressId(){
        return addressId;
    }

    public void setAddressId(int addressId){
        this.addressId = addressId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public CheckoutRecord getCheckoutRecord() {
        return checkoutRecord;
    }

    public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
        this.checkoutRecord = checkoutRecord;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }
}
