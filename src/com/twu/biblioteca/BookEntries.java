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

    public Boolean isEntryValid(BookEntry bookEntry){
        return entries.contains(bookEntry);
    }

    public void remove(BookEntry entry){
        entries.remove(entry);
    }
}
