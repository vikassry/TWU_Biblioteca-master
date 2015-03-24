package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private int publishedYear;
    public Book(String name, String author, int publishedYear) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (publishedYear != book.publishedYear) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;

        return true;
    }


    @Override
    public String toString() {
        return name + "\t" + author +"\t"+publishedYear +System.lineSeparator();
    }
}
