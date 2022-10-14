package edu.miu.elibrary.business;

import java.io.Serial;
import java.io.Serializable;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class BookCopy implements Serializable {
    @Serial
    private static final long serialVersionUID = 8743140560302253102L;

    private int id;
    private String copyNumber;
    private String status;

    public BookCopy() {
    }

    public BookCopy(int id, String copyNumber, String status) {
        this.id = id;
        this.copyNumber = copyNumber;
        this.status = status;
    }

    public BookCopy(String copyNumber) {
        this.copyNumber = copyNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCopyNumber() {
        return copyNumber;
    }

    public void setCopyNumber(String copyNumber) {
        this.copyNumber = copyNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
