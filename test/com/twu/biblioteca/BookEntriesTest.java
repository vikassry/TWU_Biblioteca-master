package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookEntriesTest {

    @Test
    public void isEntryValidWillCheckTheEntryIsAvailableInEntryList(){
        Book book = new Book("The Adventures", "Canon", 1995);
        BookEntry bookEntry = new BookEntry("vikya",book);
        BookEntries bookEntries = new BookEntries();
        bookEntries.addEntry(bookEntry);
        assertTrue(bookEntries.isEntryValid(new BookEntry("vikya",book)));
    }


}