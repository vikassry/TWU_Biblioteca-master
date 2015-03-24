package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookEntries {
    private List<BookEntry> entries;

    public BookEntries()
    {
        this.entries = new ArrayList<BookEntry>();
    }

    public void addEntry(BookEntry entry){
        entries.add(entry);
    }
}
