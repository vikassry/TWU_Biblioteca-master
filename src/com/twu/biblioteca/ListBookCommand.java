package com.twu.biblioteca;

import java.io.PrintStream;

public class ListBookCommand implements Command {
    private final Library library;
    private PrintStream ps;

    public ListBookCommand(Library library, PrintStream ps) {
        this.library = library;
        this.ps = ps;
    }

    public void execute(){
        ps.println(getLibraryDetails());
    }

    private String getLibraryDetails() {
        String bookHistory = "";
        for(Book book : library){
            bookHistory += book.toString();
        }
        return bookHistory;
    }
}

