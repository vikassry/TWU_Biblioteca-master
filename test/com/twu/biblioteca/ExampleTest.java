package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testWelcomeReturnsWelcomeMessage() {
        BibliotecaApp app = new BibliotecaApp();
        assertEquals(app.getWelcome(), "Welcome to Biblioteca");
    }
}
