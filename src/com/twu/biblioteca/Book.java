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
    public String toString() {
        return name + "\t" + author +"\t"+publishedYear +System.lineSeparator();
    }
}
