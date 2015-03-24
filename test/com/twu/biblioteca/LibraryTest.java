package com.twu.biblioteca;


import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LibraryTest {

    @Test
    public void checkOutBookWillGiveAMessageOfSuccessfulCheckOut(){
        Library library = new Library();
        library.add(new Book("The Adventures","Canon",1995));
        Book canon = new Book("The Adventures", "Canon", 1995);
        String  expected = "Successful checkOut";
        assertEquals(library.checkOutBook(canon,"vikya"),expected);
        assertFalse(library.isAvailable(canon));
    }



}
