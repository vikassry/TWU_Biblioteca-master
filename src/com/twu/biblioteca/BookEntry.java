package com.twu.biblioteca;

public class BookEntry{
    private String customerName;
    private Book book;

    public BookEntry(String customerName, Book book) {
        this.customerName = customerName;
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookEntry)) return false;

        BookEntry entry = (BookEntry) o;

        return !(book == null || customerName == null || entry.book == null || entry.customerName == null)
                && !(!customerName.equals(entry.customerName) || !book.equals(entry.book));
    }
}
