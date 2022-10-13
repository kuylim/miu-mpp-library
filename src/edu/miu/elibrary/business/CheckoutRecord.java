package edu.miu.elibrary.business;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 10/13/2022
 */
public class CheckoutRecord implements Serializable {
    @Serial
    private static final long serialVersionUID = 3256277186210365358L;
    List<CheckoutRecordEntry> checkoutRecordEntries;

    public CheckoutRecord() {}

    public CheckoutRecord(List<CheckoutRecordEntry> checkoutRecordEntries) {
        this.checkoutRecordEntries = checkoutRecordEntries;
    }

    public List<CheckoutRecordEntry> getCheckoutRecordEntries() {
        return checkoutRecordEntries;
    }

    public void setCheckoutRecordEntries(List<CheckoutRecordEntry> checkoutRecordEntries) {
        this.checkoutRecordEntries = checkoutRecordEntries;
    }
}
