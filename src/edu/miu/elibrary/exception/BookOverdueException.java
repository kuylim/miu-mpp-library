package edu.miu.elibrary.exception;

/**
 * Author: Kuylim TITH
 * Date: 10/14/2022
 */
public class BookOverdueException extends RuntimeException {
    public BookOverdueException(String s) {
        super(s);
    }
}
