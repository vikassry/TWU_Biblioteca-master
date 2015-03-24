package com.twu.biblioteca;

import java.util.Date;

public class BookEntry{
    private String customerName;
    private Date date;
    private Book book;

    public BookEntry(String customerName, Date date, Book book) {
        this.customerName = customerName;
        this.date = date;
        this.book = book;
    }

}
