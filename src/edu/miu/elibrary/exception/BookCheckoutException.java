package edu.miu.elibrary.exception;

/**
 * Author: Kuylim TITH
 * Date: 10/13/2022
 */
public class BookCheckoutException extends RuntimeException {
    public BookCheckoutException(String s) {
        super(s);
    }
}
