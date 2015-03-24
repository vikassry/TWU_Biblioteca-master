package com.twu.biblioteca;


import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void testWelcomeReturnsWelcomeMessage() {

        Biblioteca app = new Biblioteca();
        assertEquals(app.getWelcome(), "Welcome to Biblioteca"+System.lineSeparator());
    }
}
