package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    @Rule
    public ExpectedException thrown  = ExpectedException.none();
    private Library library;
    private Book canon;
    @Before
    public void setUp() throws Exception {
        library = new Library();
        canon = new Book("The Adventures", "Canon", 1995);
        library.add(canon);
    }


    @Test
    public void checkOutBookWillGiveAMessageOfSuccessfulCheckOut() throws BookNotAvailableException {
        String  expected = "Thank You! Enjoy the book\n";
        assertEquals(library.checkOutBook(canon, "vikya"), expected);
    }

    @Test
    public void checkOutBookWillRemovesTheBookFromLibrary() throws BookNotAvailableException {
        assertTrue(library.isAvailable(canon));

        library.checkOutBook(canon, "vikya");
        assertFalse(library.isAvailable(canon));
    }

    @Test
    public void checkOutBookThrowsBookNotAvailableExceptionWhenBookNotFound() throws BookNotAvailableException {
        thrown.expect(BookNotAvailableException.class);
        thrown.expectMessage("That book is not available.\n");
        library.checkOutBook(new Book("Pet Detective", "Poojara", 2020), "pchopra");
    }
    
    @Test
    public void returnBookToCustomerWillGiveAMessageOfSuccessfulreturning() throws BookNotValidException, BookNotAvailableException {
        library.checkOutBook(canon, "vikya");
        String expected = "Thank you for returning the book"+System.lineSeparator();
        assertEquals(library.returnBook(canon, "vikya"), expected);
    }
}
