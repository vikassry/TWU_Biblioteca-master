package com.twu.biblioteca;

/**
 * Created by vikass on 3/21/2015.
 */
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
        return name + "\t" + author +"\t"+publishedYear+"\n";
    }
}
