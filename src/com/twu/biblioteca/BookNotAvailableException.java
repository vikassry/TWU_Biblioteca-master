package com.twu.biblioteca;

public class BookNotAvailableException extends Throwable {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
