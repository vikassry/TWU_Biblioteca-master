package com.twu.biblioteca;

import java.io.PrintStream;

public class ListBooksCommand implements Command {
    private final Library library;
    private PrintStream ps;

    public ListBooksCommand(Library library, PrintStream ps) {
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

